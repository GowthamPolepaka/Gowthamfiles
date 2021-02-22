package StringPrograms;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = scan.next();
		String s2 = "";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch = s1.charAt(i);
			System.out.print(ch);
		}
		
	}

}
