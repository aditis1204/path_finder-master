GDBRST 2.1 Representation Style Table
#Created by Common Viewer on 13:00 13-Dec-00
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
Table "Title 1 RST"
Unit PAPER MM
Type VECTOR
Groups 
    0, "Title"
Repcodes
1    ,  0, 0, 310,   100, "PCI Roman - Center (Subtitle)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 3.060000	Alignment   = 1#0.000100
2    ,  0, 0, 310,   100, "PCI Roman - Center (Title)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 5.100000	Alignment   = 1#0.000100
3    ,  0, 0, 310,   100, "PCI Roman - Left (Subtitle)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 3.060000	Alignment   = 0#0.000100
4    ,  0, 0, 310,   100, "PCI Romand - Left (Title)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 5.100000	Alignment   = 0#0.000100
5    ,  0, 0, 310,   100, "PCI Roman - Right (Subtitle)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 3.060000	Alignment   = 2#0.000100
6    ,  0, 0, 310,   100, "PCI Roman - Right (Title)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 5.100000	Alignment   = 2#0.000100
EndTable
Color_Table ""
EndTable
Lut_Table
Entry= 0 1 "CtrSub" PCI Roman - Center (Subtitle) 
Entry= 1 2 "CtrTtl" PCI Roman - Center (Title) 
Entry= 2 3 "LftSub" PCI Roman - Left (Subtitle) 
Entry= 3 4 "LftTtl" PCI Romand - Left (Title) 
Entry= 4 5 "RgtSub" PCI Roman - Right (Subtitle) 
Entry= 5 6 "RgtTtl" PCI Roman - Right (Title) 
Group= 0 0 Title
LutId= 0
LutId= 1
LutId= 2
LutId= 3
LutId= 4
LutId= 5
EndTable
