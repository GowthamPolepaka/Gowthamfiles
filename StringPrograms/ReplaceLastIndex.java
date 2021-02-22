package StringPrograms;

import java.util.Scanner;

public class ReplaceLastIndex 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = scan.next();
		System.out.println("Enter the Character");
		char ch = scan.next().charAt(0);
		int k = s1.lastIndexOf(ch);
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(i==k)
			{
				System.out.println("Ss");
			}
			else
			{
				System.out.println(s1.charAt(i));
			}
		}
		
		}
	}


