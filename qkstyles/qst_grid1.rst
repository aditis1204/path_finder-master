GDBRST 2.1 Representation Style Table
#Created by Common Viewer on 12:43 12-Dec-00
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
Table "Grid 1 RST"
Unit PAPER MM
Type VECTOR
Groups 
    0, "Grid"
Repcodes
1    ,  0, 0, 310, 50000, "Grid Center Heading"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 2.000000	Alignment   = 1#0.000100
2    ,  0, 0,  10, 50000, "Grid Graticule Line"
	Width       = 0.100000	Color       = FALSE; RGB ;0;0;0
	Distance-From-Axis= 0.000000
3    ,  0, 0, 100, 50000, "Grid Graticule Surface"
	Color       = FALSE; RGB ;0;0;0
4    ,  0, 0, 310, 50000, "Grid Left Heading"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 2.000000	Alignment   = 0#0.000100
5    ,  0, 0,  10, 50000, "Grid Line - 0.1 mm black"
	Width       = 0.100000	Color       = FALSE; RGB ;0;0;0
	Distance-From-Axis= 0.000000
6    ,  0, 0, 310, 50000, "Grid Right Heading "
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 2.000000	Alignment   = 2#0.000100
7    ,  0, 0, 310, 50000, "Grid Left Heading "
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 2.500000	Alignment   = 1#2.500000
8    ,  0, 0, 310, 50000, "Grid Cross Heading "
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 2.000000	Alignment   = 0#0.000100
9    ,  0, 0, 310, 50000, "Grid Special Label"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 2.500000	Alignment   = 0#0.000100
10   ,  0, 0,  10, 50001, "Grid Border Line - 0.1 mm black"
	Width       = 0.100000	Color       = FALSE; RGB ;0;0;0
	Distance-From-Axis= 0.000000	
EndTable
Color_Table ""
EndTable
Lut_Table
Entry= 0 1 "Grid_CentreHeding" Grid Center Heading 
Entry= 1 2 "Grid_Graticule_Line" Grid Graticule Line 
Entry= 2 3 "Grid_Graticule_Surface" Grid Graticule Surface 
Entry= 3 4 "Grid_LeftHeding" Grid Left Heading 
Entry= 4 5 "Grid_Line" Grid Line - 0.1 mm black 
Entry= 5 6 "Grid_RightHeding" Grid Right Heading 
Entry= 6 7 "Grid_SpecialHeding" Grid Left Heading 
Entry= 7 8 "Grid_CrossHeding" Grid Cross Heading 
Entry= 8 9 "Grid_SpecialLabel" Grid Special Label 
Entry= 9 10 "Grid_BorderLine" Grid Border Line - 0.1 mm black 
Group= 0 0 Grid
LutId= 0
LutId= 1
LutId= 2
LutId= 3
LutId= 4
LutId= 5
LutId= 6
LutId= 7
LutId= 8
LutId= 9
EndTable
