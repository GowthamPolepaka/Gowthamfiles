package StringPrograms;

import java.util.Scanner;

public class Concat 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First String");
		String s1 = scan.next();
		System.out.println("Enter Second String");
		String s2 = scan.next();
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
	}

}
