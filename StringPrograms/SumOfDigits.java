package StringPrograms;

import java.util.Scanner;

public class SumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = scan.next();
		int sum = 0;
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch = s1.charAt(i);
			if(Character.isDigit(ch))
			{
					String s2 = Character.toString(ch);
					int k = Integer.parseInt(s2);
					sum = sum+k;
							
			}
		}
		System.out.println(sum);
	}

}
