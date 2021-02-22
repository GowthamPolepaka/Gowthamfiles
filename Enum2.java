package org.trainingDay7;

import java.util.Iterator;

public class Enum2 
{
	
	public enum Season{WINTER, SUMMER, RAINY ,FALL, SPRING}
	{
		System.out.println("They are seasons");
	}
	public static void main(String[] args) 
	{
		Season[] a=Season.values();
		{
			for	(int i=0;i<=a.length-1;i++)
			{
				System.out.println(a[i]);
			}
				
		}
		
	}

}
