package com.assignments;

public class PatternD 
{
	public static void main(String[] args)
	{
	
		PatternD d=new PatternD();
		d.dPattern();
	}
	public void dPattern()
	{
		int i,j; 
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++) 
			{
				if(j==1 ||i==1&&j<=4||i==5&&j<=4||i>=2&&i<=4&&j==5)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}


}
