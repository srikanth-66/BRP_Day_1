package com.assignments;

public class PatternG 
{
	public static void main(String[] args)
	{
	
		PatternG g=new PatternG();
		g.gPattern();
	}
	public void gPattern()
	{
		int i,j; 
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++) 
			{
				if(i==1||j==1||i==3&&j>=3||i==5&&j<=3||j==5&&i>=3)
					System.out.print("*");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}




}
