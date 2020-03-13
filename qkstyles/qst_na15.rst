GDBRST 2.1 Representation Style Table
#Created by Common Viewer on 15:01 13-Dec-00
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
Table "North Arrow 15 RST"
Unit PAPER MM
Type VECTOR
Symbols "qst_na15.sym"
Groups 
    0, "North Arrow"
Repcodes
1    ,  0, 0, 310,   100, "PCI Sans Serif - Center (Grid North)"
	Font        = "PCI Sans Serif"
	Size        = 1.500000	Alignment   = 1#0.000100
2    ,  0, 0, 310,   100, "PCI Sans Serif - Left (Grid North)"
	Font        = "PCI Sans Serif"
	Size        = 1.500000	Alignment   = 0#0.000100
3    ,  0, 0, 310,   100, "PCI Sans Serif - Right (Grid North)"
	Font        = "PCI Sans Serif"
	Size        = 1.500000	Alignment   = 2#0.000100
4    ,  0, 0, 210,  1000, "North Arrow 15"
	SymbolId    = 140;0
	Scale       = 15.000000
5    ,  0, 0, 310,   100, "PCI Sans Serif - Center (Magnetic North)"
	Font        = "PCI Sans Serif"
	Size        = 1.500000	Alignment   = 1#0.000100
6    ,  0, 0, 310,   100, "PCI Sans Serif - Left (Magnetic North)"
	Font        = "PCI Sans Serif"
	Size        = 1.500000	Alignment   = 0#0.000100
7    ,  0, 0, 310,   100, "PCI Sans Serif - Right (Magnetic North)"
	Font        = "PCI Sans Serif"
	Size        = 1.500000	Alignment   = 2#0.000100
8    ,  0, 0, 210,   100, "Magnetic North Symbol"
	SymbolId    = 140;0
	Color       = FALSE; RGB ;0;0;0
	Scale       = 15.000000
9    ,  0, 0, 310,   100, "PCI Sans Serif - Center (True North)"
	Font        = "PCI Sans Serif"
	Size        = 1.500000	Alignment   = 1#0.000100
10   ,  0, 0, 310,   100, "PCI Sans Serif - Left (True North)"
	Font        = "PCI Sans Serif"
	Size        = 1.500000	Alignment   = 0#0.000100
11   ,  0, 0, 310,   100, "PCI Sans Serif - Right (True North)"
	Font        = "PCI Sans Serif"
	Size        = 1.500000	Alignment   = 2#0.000100
12   ,  0, 0, 210,   100, "True North Symbol "
	SymbolId    = 140;0
	Color       = FALSE; RGB ;0;0;0
	Scale       = 15.000000
EndTable
Color_Table ""
EndTable
Lut_Table
Entry= 3 4 "GNSym" North Arrow 15 
Entry= 12 1 "GNC" PCI Sans Serif - Center (Grid North) 
Entry= 13 2 "GNL" PCI Sans Serif - Left (Grid North) 
Entry= 14 3 "GNR" PCI Sans Serif - Right (Grid North) 
Entry= 15 5 "MNC" PCI Sans Serif - Center (Magnetic North) 
Entry= 16 6 "MNL" PCI Sans Serif - Left (Magnetic North) 
Entry= 17 7 "MNR" PCI Sans Serif - Right (Magnetic North) 
Entry= 18 8 "MNSym" Magnetic North Symbol 
Entry= 19 9 "TNC" PCI Sans Serif - Center (True North) 
Entry= 20 10 "TNL" PCI Sans Serif - Left (True North) 
Entry= 21 11 "TNR" PCI Sans Serif - Right (True North) 
Entry= 22 12 "TNSym" True North Symbol 
Group= 0 0 North Arrow
LutId= 3
LutId= 12
LutId= 13
LutId= 14
LutId= 15
LutId= 16
LutId= 17
LutId= 18
LutId= 19
LutId= 20
LutId= 21
LutId= 22
EndTable
