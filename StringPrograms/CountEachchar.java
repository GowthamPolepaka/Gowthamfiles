package StringPrograms;

import java.util.Scanner;

public class CountEachchar 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = scan.next();
		String s2 = "";
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch = s1.charAt(i);
			int k = s2.indexOf(ch);
			if(k == -1)
			{
				s2 = s2+ch;
			}
		}
		for(int i=0;i<=s2.length()-1;i++)
		{
			char ch = s2.charAt(i);
			int count = 0;
			for(int j=0;j<=s1.length()-1;j++)
			{
				char ch1 = s1.charAt(j);
				if(ch == ch1)
				{
					count++;
				}
				
			}
			System.out.println(ch+" "+count);
		}
		
	}

}
