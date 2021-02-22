package org.trainingDay7;

public class Enum6 
{
	public enum Month{APRIL, MAY, JUNE, JULY, AUGUST, }
	
	public static void main(String[] args) 
	{
		Month[] a = Month.values();
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
