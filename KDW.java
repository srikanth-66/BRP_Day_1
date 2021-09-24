package com.assignments;

public class KDW
{
	public static void main(String[] args) 
	{
		kdw();
		
	}
	public static void kdw()
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=30;j++)
			{
				if(j ==1 ||(j==2 && i==3 )||(j==3 &&i==2)||(j==4 && i==1)
						||(j==3 && i==4)||(j==4 && i==5)||
						j==10||i==1&&j==14||i==5&&j==14||i>=2&&i<=4&&j==15
						||j ==24 || j==30)
					System.out.print("**");

				else if(i==3&&j==27||i==4&&j==25||i==4&&j==29)
					System.out.print("*");


				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
