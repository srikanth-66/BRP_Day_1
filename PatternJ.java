package com.assignments;

public class PatternJ 
{
	public static void main(String[] args)
	{
	
		PatternJ j=new PatternJ();
		j.jPattern();
	}
	public void jPattern()
	{
		int i,j; 
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++) 
			{
				if(i==1||j==3||i==5&&j<=3)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}




}
