package com.assignments;

public class PatternA 
{
	public static void main(String[] args) 
	{
		PatternA a=new PatternA();
		a.aPattern();
		
	}
	public void aPattern()
	{
		int i,j; 
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++) 
			{
				if(i==1&&j==3||(i==2&&j==2&&i-j==0)||(i==2&&j==4&&j-i==2)||i==3 ||
						j==1&&i>=4||j==5&&i>=4)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

}
