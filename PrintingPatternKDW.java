package com.assignments;

public class PrintingPatternKDW 
{
	public int kPattern(int n)
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<5;j++)
			{
				if(j ==1 ||(j==2 && i==3 )||(j==3 &&i==2)||(j==4 && i==1)||(j==3 && i==4)||(j==4 && i==5))
					System.out.print(" ** ");
				else
					System.out.print("     ");
			}
			System.out.println();
		}return 0;
	}
	public int dPattern(int n)
	{
		int i,j; 
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++) 
			{
				if(j==1 ||i==1&&j<=4||i==5&&j<=4||i>=2&&i<=4&&j==5)
					System.out.print(" ** ");
				else
					System.out.print("     ");
			}
			System.out.println();
		}
		return 0;
		
	}
	public int wPattern(int n)
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(j ==1 || j==5 ||(j==2 && i==4)||(j==3 && i==3)||(j==4 && i==4))
					System.out.print(" ** ");
				else
					System.out.print("    ");
			}
			System.out.println();
		}return 0;
	}

	public static void main(String[] args)
	{
		PrintingPatternKDW kdw=new PrintingPatternKDW();
		/*kdw.kPattern(5);
		System.out.println();
		kdw.dPattern(5);
		System.out.println(5);
		kdw.wPattern(5);*/
		System.out.print(+kdw.kPattern(5)+kdw.dPattern(5)+kdw.wPattern(5));
		/*System.out.print(kdw.kPattern(5));
		System.out.print(kdw.dPattern(5));
		System.out.print(kdw.wPattern(5));*/

			
	}
}

