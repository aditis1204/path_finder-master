GDBRST 2.1 Representation Style Table
#Created by Common Viewer on 13:04 13-Dec-00
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
Table "Text Annotation 3 RST"
Unit PAPER MM
Type VECTOR
Groups 
    0, "Text Annotation"
Repcodes
1    ,  0, 0, 310,   100, "PCI Roman - Right (Text Annotation)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 3.060000	Alignment   = 2#0.000100
2    ,  0, 0, 310,   100, "PCI Roman - Right (Text Annotation)"
	Font        = "PCI Roman"
	Size        = 5.100000	Alignment   = 2#0.000100
EndTable
Color_Table ""
EndTable
Lut_Table
Entry= 0 1 "LftTxtAnnS" Text Annotation default
Entry= 1 2 "LftTxtAnn" Text Annotation default
Group= 0 0 Text Annotation
LutId= 0
LutId= 1
EndTable
