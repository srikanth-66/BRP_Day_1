package com.assignments;

public class PatternI 
{
	public static void main(String[] args)
	{
	
		PatternI i=new PatternI();
		i.iPattern();
	}
	public void iPattern()
	{
		int i,j; 
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++) 
			{
				if(i==1||j==3||i==5)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}




}
