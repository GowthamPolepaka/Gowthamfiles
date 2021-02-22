package StringPrograms;

import java.util.Scanner;

public class ExtractDuplicates 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = scan.next();
		String s2 = "";
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch = s1.charAt(i);
			int k = s2.indexOf(ch);
			if(k==-1)
			{
				s2 = s2+ch;
			}
		}
		System.out.println(s2);
	}

}
