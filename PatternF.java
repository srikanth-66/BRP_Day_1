package com.assignments;

public class PatternF
{
	public static void main(String[] args)
	{
	
		PatternF f=new PatternF();
		f.fPattern();
	}
	public void fPattern()
	{
		int i,j; 
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++) 
			{
				if(j==1 ||i==1||i==3)
					System.out.print("*");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}




}
