package com.assignments;

public class PatternB 
{
	public static void main(String[] args) 
	{
		PatternB b=new PatternB();
		b.bPattern();
		
	}
	public void bPattern()
	{
		int i,j; 
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++) 
			{
				if(j==1||i==1||i==5||(i==2&&j==5)||(i==4&&j==5)||(i==3&&j==2)||(i==3&&j==3))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}


}
