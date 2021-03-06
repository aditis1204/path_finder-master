/*
 * Copyright 2018 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ar.core.examples.java.cloudanchor;

import android.support.annotation.Nullable;

import com.google.ar.core.Anchor;
import com.google.ar.core.Anchor.CloudAnchorState;
import com.google.ar.core.Session;
import com.google.common.base.Preconditions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * A helper class to handle all the Cloud Anchors logic, and add a callback-like mechanism on top of
 * the existing ARCore API.
 */
class CloudAnchorManager {
    private static final String TAG =
            CloudAnchorActivity.class.getSimpleName() + "." + CloudAnchorManager.class.getSimpleName();
    private final HashMap<Anchor, CloudAnchorListener> pendingAnchors = new HashMap<>();
    @Nullable
    private Session session = null;

    private static boolean isReturnableState(CloudAnchorState cloudState) {
        switch (cloudState) {
            case NONE:
            case TASK_IN_PROGRESS:
                return false;
            default:
                return true;
        }
    }

    /**
     * This method is used to set the session, since it might not be available when this object is
     * created.
     */
    synchronized void setSession(Session session) {
        this.session = session;
    }

    /**
     * This method hosts an anchor. The {@code listener} will be invoked when the results are
     * available.
     */
    synchronized void hostCloudAnchor(Anchor anchor, CloudAnchorListener listener) {
        Preconditions.checkNotNull(session, "The session cannot be null.");
        Anchor newAnchor = session.hostCloudAnchor(anchor);
        pendingAnchors.put(newAnchor, listener);
    }

    /**
     * This method resolves an anchor. The {@code listener} will be invoked when the results are
     * available.
     */
    synchronized void resolveCloudAnchor(String anchorId, CloudAnchorListener listener) {
        Preconditions.checkNotNull(session, "The session cannot be null.");
        Anchor newAnchor = session.resolveCloudAnchor(anchorId);
        pendingAnchors.put(newAnchor, listener);
    }

    /**
     * Should be called after a {@link Session#update()} call.
     */
    synchronized void onUpdate() {
        Preconditions.checkNotNull(session, "The session cannot be null.");
        Iterator<Map.Entry<Anchor, CloudAnchorListener>> iter = pendingAnchors.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Anchor, CloudAnchorListener> entry = iter.next();
            Anchor anchor = entry.getKey();
            if (isReturnableState(anchor.getCloudAnchorState())) {
                CloudAnchorListener listener = entry.getValue();
                listener.onCloudTaskComplete(anchor);
                iter.remove();
            }
        }
    }

    /**
     * Used to clear any currently registered listeners, so they wont be called again.
     */
    synchronized void clearListeners() {
        pendingAnchors.clear();
    }

    /**
     * Listener for the results of a host or resolve operation.
     */
    interface CloudAnchorListener {

        /**
         * This method is invoked when the results of a Cloud Anchor operation are available.
         */
        void onCloudTaskComplete(Anchor anchor);
    }
}
