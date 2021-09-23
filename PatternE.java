package com.assignments;

public class PatternE 
{
	public static void main(String[] args)
	{
	
		PatternE e=new PatternE();
		e.ePattern();
	}
	public void ePattern()
	{
		int i,j; 
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++) 
			{
				if(j==1 ||i==1||i==5|i==3)
					System.out.print("*");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}




}
