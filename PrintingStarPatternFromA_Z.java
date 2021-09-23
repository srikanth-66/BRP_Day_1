package com.assignments;

import java.util.Scanner;

public class PrintingStarPatternFromA_Z 
{
	public static void main(String[] args) 
	{
		Scanner user_input =new Scanner(System.in);
		int choice;
		System.out.println("Enter the number (1-26) that will print the  Alphabet you Want to Print");
		choice=user_input.nextInt();
		while(choice <= 26) 
		{
			
			switch(choice)
			{
				case 1:		System.out.println("here is the Star pattern of Alphabet 'A'");
							PatternA a=new PatternA();
							a.aPattern();
							break;
				case 2:		System.out.println("here is the Star pattern of Alphabet 'B'");
							PatternB b=new PatternB();
							b.bPattern();
							break;
				case 3:		System.out.println("here is the Star pattern of Alphabet 'C'");
							PatternC c=new PatternC();
							c.cPattern();
							break;
				case 4:		System.out.println("here is the Star pattern of Alphabet 'D'");
							PatternD d=new PatternD();
							d.dPattern();
							break;
				case 5:		System.out.println("here is the Star pattern of Alphabet 'E'");
							PatternE e=new PatternE();
							e.ePattern();
							break;
				case 6:		System.out.println("here is the Star pattern of Alphabet 'F'");
							PatternF f=new PatternF();
							f.fPattern();
							break;
				case 7:		System.out.println("here is the Star pattern of Alphabet 'G'");
							PatternG g=new PatternG();
							g.gPattern();
							break;
				case 8:		System.out.println("here is the Star pattern of Alphabet 'H'");
							PatternH h=new PatternH();
							h.hPattern();
							break;
				case 9:		System.out.println("here is the Star pattern of Alphabet 'I'");
							PatternI i=new PatternI();
							i.iPattern();
							break;
				case 10:	System.out.println("here is the Star pattern of Alphabet 'J'");
							PatternJ j=new PatternJ();
							j.jPattern();
							break;
				case 11:	System.out.println("here is the Star pattern of Alphabet 'K'");
							PatternK k=new PatternK();
							k.kPattern();
							break;
				case 12:	System.out.println("here is the Star pattern of Alphabet 'L'");
							PatternL l=new PatternL();
							l.lPattern();
							break;
				case 13:	System.out.println("here is the Star pattern of Alphabet 'M'");
							PatternM m=new PatternM();
							m.mPattern();
							break;
				case 14:	System.out.println("here is the Star pattern of Alphabet 'N'");
							PatternN n=new PatternN();
							n.nPattern();
							break;
				case 15:	System.out.println("here is the Star pattern of Alphabet 'O'");
							PatternO o=new PatternO();
							o.oPattern();
							break;
				case 16:	System.out.println("here is the Star pattern of Alphabet 'P'");
							PatternP p=new PatternP();
							p.pPattern();
							break;
				case 17:	System.out.println("here is the Star pattern of Alphabet 'Q'");
							PatternQ q=new PatternQ();
							q.qPattern();
							break;
				case 18:	System.out.println("here is the Star pattern of Alphabet 'R'");
							PatternR r=new PatternR();
							r.rPattern();
							break;
				case 19:	System.out.println("here is the Star pattern of Alphabet 'S'");
							PatternS s=new PatternS();
							s.sPattern();
							break;
				case 20:	System.out.println("here is the Star pattern of Alphabet 'T'");
							PatternT t=new PatternT();
							t.tPattern();
							break;
				case 21:	System.out.println("here is the Star pattern of Alphabet 'U'");
							PatternU u=new PatternU();
							u.uPattern();
							break;
				case 22:	System.out.println("here is the Star pattern of Alphabet 'v'");
							PatternV v=new PatternV();
							v.vPattern();
							break;
				case 23:	System.out.println("here is the Star pattern of Alphabet 'W'");
							PatternW w=new PatternW();
							w.wPattern();
							break;
				case 24:	System.out.println("here is the Star pattern of Alphabet 'X'");
							PatternX x=new PatternX();
							x.xPattern();
							break;
				case 25:	System.out.println("here is the Star pattern of Alphabet 'Y'");
							PatternY y=new PatternY();
							y.yPattern();
							break;
	
				case 26:	System.out.println("here is the Star pattern of Alphabet 'Z'");
							PatternZ z=new PatternZ();
							z.zPattern();
							break;
				default :	System.out.println("Please Select numbers friom 1-26");
			}
		
		break; 
		}
	}

}
