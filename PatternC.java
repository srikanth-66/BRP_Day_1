package com.assignments;

public class PatternC
{
	public static void main(String[] args) 
	{
		PatternC c=new PatternC();
		c.cPattern();
		
	}
	public void cPattern()
	{
		int i,j; 
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++) 
			{
				if(i==1 && j>=2 || i==5 && j>=2 ||(j==1 &&i>=2 && i<=4))
				//if((i==1 && j==1)||(i==5 && j==1))
					//System.out.print(" ");
				//else if(i==1 ||j==1||i==5||j==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}




}
