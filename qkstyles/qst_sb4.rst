GDBRST 2.1 Representation Style Table
#Created by focus on 20:13 29-Mar-01
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
Table "Scalebar 4 RST"
Unit PAPER MM
Type VECTOR
Groups 
    0, "Scalebar"
Repcodes
1    ,  0, 0, 100,     1, "White polygon"
	Color       = FALSE; RGB ;255;255;255
2    ,  0, 0, 100,     1, "White polygon"
	Color       = FALSE; RGB ;255;255;255
3    ,  0, 0, 310,   100, "PCI Roman - Center (Scalebar Title)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 2.000000	Alignment   = 1#0.000100
4    ,  0, 0, 310,   100, "PCI Roman -  Center (Scalebar Heading)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 1.530000	Alignment   = 1#2.500000
5    ,  0, 0, 310,   100, "PCI Roman - Left (Scalebar Title)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 2.550000	Alignment   = 0#0.000100
6    ,  0, 0, 310,   100, "PCI Roman - Left (Scalebar Units)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 1.530000	Alignment   = 0#0.000100
7    ,  0, 0, 100,     1, "White polygon"
	Color       = FALSE; RGB ;255;255;255
8    ,  0, 0, 100,     1, "Black polygon"
	Color       = FALSE; RGB ;0;0;0
9    ,  0, 0,  10,    99, "Scalebar Outline"
	Width       = 0.080000	Color       = FALSE; RGB ;0;0;0
	Distance-From-Axis= 0.000000
10   ,  0, 0, 310,   100, "PCI Roman - Right (Scalebar Title)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 2.550000	Alignment   = 2#0.000100
11   ,  0, 0, 310,   100, "PCI Roman - Right (Scalebar Units)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 1.530000	Alignment   = 2#0.000100
12   ,  0, 0, 310,   100, "PCI Roman - Center (Scalebar Subheading)"
	Font        = "PCI Roman"
	Color       = FALSE; RGB ;0;0;0
	Size        = 1.530000	Alignment   = 1#0.000100
13   ,  0, 0,  10,    99, "Scalebar Tick Line"
	Width       = 0.120000	Color       = FALSE; RGB ;0;0;0
	Distance-From-Axis= 0.000000
14   ,  0, 0,  10,    99, "Scalebar Ticks"
	Width       = 0.120000	Color       = FALSE; RGB ;0;0;0
	Distance-From-Axis= 0.000000
15   ,  0, 0,  10,    99, "Scalebar Subticks"
	Width       = 0.120000	Color       = FALSE; RGB ;0;0;0
	Distance-From-Axis= 0.000000
16   ,  0, 0, 100,     1, "White polygon"
	Color       = FALSE; RGB ;255;255;255
17   ,  0, 0, 100,     1, "White polygon "
	Color       = FALSE; RGB ;255;255;255
EndTable
Color_Table ""
EndTable
Lut_Table
Entry= 0 1 "SBBtmLftB" White polygon 
Entry= 1 2 "SBBtmRgtB" White polygon 
Entry= 2 3 "SBCtrTtl" PCI Roman - Center (Scalebar Title) 
Entry= 3 4 "SBHeading" PCI Roman -  Center (Scalebar Heading) 
Entry= 4 5 "SBLftTtl" PCI Roman - Left (Scalebar Title) 
Entry= 5 6 "SBLftUnits" PCI Roman - Left (Scalebar Units) 
Entry= 6 7 "SBMdlLftB" White polygon 
Entry= 7 8 "SBMdlRgtB" Black polygon 
Entry= 8 9 "SBOutLn" Scalebar Outline 
Entry= 9 10 "SBRgtTtl" PCI Roman - Right (Scalebar Title) 
Entry= 10 11 "SBRgtUnits" PCI Roman - Right (Scalebar Units) 
Entry= 11 12 "SBSubHeading" PCI Roman - Center (Scalebar Subheading) 
Entry= 12 13 "SBTckLn" Scalebar Tick Line 
Entry= 13 14 "SBTckMn" Scalebar Ticks 
Entry= 14 15 "SBTckSb" Scalebar Subticks 
Entry= 15 16 "SBTopLftB" White polygon 
Entry= 16 17 "SBTopRgtB" White polygon 
Group= 0 0 Scalebar
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
EndTable
