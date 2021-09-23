package com.assignments;

import java.util.Scanner;

public class LeapYearCheck 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year you want check");
		int year=sc.nextInt();
		if(year%400==0||year%4==0||year%100!=0)
		{
			System.out.println(+year+" this is a leap year");
		}
		else
			System.out.println(+year+"this is not a leap year");
		
	}

}
