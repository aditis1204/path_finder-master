GDBRST 2.1 Representation Style Table
#Created by Common Viewer on 12:21 12-Dec-00
#Available primitive functions:
#
#10    - Simple-Line
#15    - Complex-Line
#25    - Dash-Line
#30    - Spaced-Symbols
#40    - Dotted-Line
#100   - Solid-Polygon
#120   - Transparent-Polygon
#200   - Simple-Point
#210   - Point-Symbol
#310   - Vector-Text
#110   - Patterned-Fill
#600   - Solid-Fill
#610   - Transparent
#620   - TranslucentFill
#630   - See-Through-Pattern
#640   - Solid-Pattern
#
#Description of first line of Repcode
#<Repcode>,<Part_Number>,<GroupId>,<PrimId>,<Priority>,<Description>
#
#Refer to your manual for more details
#
Table "Border 1 RST"
Unit PAPER MM
Type VECTOR
Groups 
    0, "Border"
Repcodes
1    ,  0, 0,  10, 50000, "Border 1 - 0.75 mm / 0.12 mm"
	Width       = 0.750000	Color       = FALSE; RGB ;0;0;0
	Distance-From-Axis= -0.375000
1    ,  1, 0,  10, 50001, ""
	Width       = 0.120000	Color       = FALSE; RGB ;0;0;0
	Distance-From-Axis= -1.500000
EndTable
Color_Table ""
EndTable
Lut_Table
Entry= 0 1 "Border" Border 1 - 0.75 mm / 0.12 mm 
Group= 0 0 Border
LutId= 0
EndTable
