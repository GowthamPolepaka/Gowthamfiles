package StringPrograms;

import java.util.Scanner;

public class LengthOfString 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = scan.next();
		//System.out.println(s1.length());
		int count = 0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch = s1.charAt(i);
			count++;
		}
		System.out.println(count);
	}
}
