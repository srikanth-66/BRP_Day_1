package com.assignments;

import java.util.Scanner;

public class ThreeNames {
	public static void namesPrint(String name1,String name2,String name3)
	{
		System.out.println(" Hello " +name1+ " , " +name2+ " and " +name3);
		
	}
	public static void main(String[] args) 
	{
		Scanner names=new Scanner(System.in);
		System.out.println("Enter The Names");
		String name1=names.next();
		String name2=names.next();
		String name3=names.next();
		ThreeNames name=new ThreeNames();
		namesPrint(name1, name2, name3);
	}

}
