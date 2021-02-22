package StringPrograms;

import java.util.Scanner;

public class ReverseStringWords 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String s1 = scan.nextLine();
		String[] sArr = s1.split(" ");
		for(int i=sArr.length-1;i>=0;i--)
		{
			System.out.print(sArr[i]+" ");
		}
		
	}

}
