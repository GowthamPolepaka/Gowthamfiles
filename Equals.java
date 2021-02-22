package org.trainingDay7;

import java.util.Scanner;

public class Equals 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = scan.next();
		System.out.println("Enter the Second String");
		String s2 = scan.next();
		
		if(s1.equals(s2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
	}

}
