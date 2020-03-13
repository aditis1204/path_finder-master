GDBRST 2.1 Representation Style Table
#Created by Common Viewer on 11:31 18-Dec-00
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
Table "Legend 4 RST"
Unit PAPER MM
Type VECTOR
Symbols "qst_lg4.sym"
Groups 
    0, "Legend"
Repcodes
1    ,  0, 0,  10,   102, "Legend border"
	Width       = 0.500000	Distance-From-Axis= 0.000000
2    ,  0, 0, 310,   100, "PCI Roman - Center (Legend Title)"
	Font        = "PCI Roman"
	Size        = 4.500000	Alignment   = 1#0.000100
3    ,  0, 0, 310,   100, "PCI Roman - Justify (Legend Title) "
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 5.100000	Alignment   = 3#0.000100
4    ,  0, 0, 310,   100, "PCI Roman - Left (Legend title)"
	Font        = "PCI Roman"
	Size        = 4.500000	Alignment   = 0#0.000100
5    ,  0, 0, 310,   100, "PCI Roman - Right (Legend title)"
	Font        = "PCI Roman"
	Size        = 4.500000	Alignment   = 2#0.000100
6    ,  0, 0,  10,   101, "Legend Border "
	Width       = 0.000000	Color       = FALSE; RGB ;0;0;0
	Distance-From-Axis= 0.000000
7    ,  0, 0,  10,   100, "Legend border"
	Width       = 0.500000	Distance-From-Axis= 0.000000
8    ,  0, 0,  10,   101, "Column Legend_Column_2 Outline - Canadian Standard 1:50000"
	Width       = 0.120000	Color       = FALSE; RGB ;0;0;0
	Distance-From-Axis= 0.000000
9    ,  0, 0,  10,   101, "Column Legend (4) Outline - Canadian Standard 1:50000"
	Width       = 0.120000	Color       = FALSE; RGB ;0;0;0
	Distance-From-Axis= 0.000000
10   ,  0, 0,  10,   101, "Column Legend (4)_3 Outline - Canadian Standard 1:50000"
	Width       = 0.120000	Color       = FALSE; RGB ;0;0;0
	Distance-From-Axis= 0.000000
11   ,  0, 0, 310,   100, "PCI Roman - Justify (Item text)"
	Font        = "PCI Roman"
	Size        = 2.000000	Alignment   = 0#0.000100
12   ,  0, 0, 310,   100, "PCI Roman - Justify (Item text)"
	Font        = "PCI Roman"
	Size        = 2.000000	Alignment   = 1#0.000100
13   ,  0, 0, 310,   100, "PCI Roman - Justify (Item text)"
	Font        = "PCI Roman"
	Size        = 2.000000	Alignment   = 2#0.000100
14   ,  0, 0, 310,   100, "PCI Roman - Justify (Item text)"
	Font        = "PCI Roman"
	Size        = 2.000000	Alignment   = 3#0.000100
15   ,  0, 0,  40,   100, "Delimeter"
	Diameter    = 0.500000	Offset      = 0.000000
	Step        = 1.000000	Distance-From-Axis= 0.000000
16   ,  0, 0, 310,   100, "PCI Roman - Justify (Section Title)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 2.040000	Alignment   = 0#0.000100
17   ,  0, 0, 310,   100, "PCI Roman - Justify (Section Title)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 2.040000	Alignment   = 1#0.000100
18   ,  0, 0, 310,   100, "PCI Roman - Justify (Section Title)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 2.040000	Alignment   = 2#0.000100
19   ,  0, 0, 310,   100, "PCI Roman - Justify (Section Title)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 2.040000	Alignment   = 3#0.000100
EndTable
Color_Table ""
EndTable
Lut_Table
Entry= 0 1 "LgdBorder" Legend border 
Entry= 1 2 "LgdCtrTtle" PCI Roman - Center (Legend Title) 
Entry= 2 3 "LgdJstTtle" PCI Roman - Justify (Legend Title) 
Entry= 3 4 "LgdLftTtle" PCI Roman - Left (Legend title) 
Entry= 4 5 "LgdRgtTtle" PCI Roman - Right (Legend title) 
Entry= 5 6 "LgdShapeBrd" Legend Border 
Entry= 6 7 "Legend_Column_ColBrdrVKey" Legend border 
Entry= 7 8 "Legend_Column_2_ColBrdrVKey" Column Legend_Column_2 Outline - Canadian Standard 1:50000 
Entry= 8 9 "Legend_Column_3_ColBrdrVKey" Column Legend (4) Outline - Canadian Standard 1:50000 
Entry= 9 10 "Legend_Column_4_ColBrdrVKey" Column Legend (4)_3 Outline - Canadian Standard 1:50000 
Entry= 10 11 "Legend_RootSection_LftKey" PCI Roman - Justify (Item text) 
Entry= 11 12 "Legend_RootSection_CtrKey" PCI Roman - Justify (Item text) 
Entry= 12 13 "Legend_RootSection_RgtKey" PCI Roman - Justify (Item text) 
Entry= 13 14 "Legend_RootSection_JstKey" PCI Roman - Justify (Item text) 
Entry= 14 15 "Legend_RootSection_Delim_Del_VKey" Delimeter 
Entry= 15 16 "Legend_RootSection_SecTtle_LftKey" PCI Roman - Justify (Section Title) 
Entry= 16 17 "Legend_RootSection_SecTtle_CtrKey" PCI Roman - Justify (Section Title) 
Entry= 17 18 "Legend_RootSection_SecTtle_RgtKey" PCI Roman - Justify (Section Title) 
Entry= 18 19 "Legend_RootSection_SecTtle_JstKey" PCI Roman - Justify (Section Title) 
Group= 0 0 Legend
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
LutId= 10
LutId= 11
LutId= 12
LutId= 13
LutId= 14
LutId= 15
LutId= 16
LutId= 17
LutId= 18
EndTable
