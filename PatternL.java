package com.assignments;

public class PatternL 
{
		public static void main(String[] args)
		{
		
			PatternL l=new PatternL();
			l.lPattern();
		}
		public void lPattern()
		{
			int i,j; 
			for(i=1;i<=5;i++)
			{
				for(j=1;j<=5;j++) 
				{
					if(j==1||i==5)
						System.out.print(" * ");
					else
						System.out.print("   ");
				}
				System.out.println();
			}
		}




	}

