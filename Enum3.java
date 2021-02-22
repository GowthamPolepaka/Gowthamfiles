package org.trainingDay7;

import org.trainingDay7.Enum1.Week;

public class Enum3 
{
	public enum COLOR{RED, BLUE, YELLOW, ORANGE, WHITE}
	
	public static void main(String[] args) {
		{
			for(COLOR c : COLOR.values())
			{
				System.out.println(c);
				
			}
			System.out.println(Week.FRIDAY);
			System.out.println(COLOR.valueOf("RED"));
			System.out.println(COLOR.valueOf("BLUE").ordinal());
			
		}
	}

}
