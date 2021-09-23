package com.assignments;

public class PatternH
{
	public static void main(String[] args)
	{
	
		PatternH h=new PatternH();
		h.hPattern();
	}
	public void hPattern()
	{
		int i,j; 
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++) 
			{
				if(j==1||j==5||i==3)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}




}
