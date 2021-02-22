package StringPrograms;

import java.util.Scanner;

public class TOLowerCase 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = scan.next();
		String s2 = s1.toLowerCase();
		System.out.println(s2);
		String s3 = s2.toUpperCase();
		System.out.println(s3);
		
	}

}
