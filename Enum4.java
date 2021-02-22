package org.trainingDay7;

public class Enum4 
{
	enum Season
	{
		WINTER(5),SPRING(10),SUMMER(54);

		private int i;

		Season(int i) 
		{
			this.i = i;
			
		}
	}
	public static void main(String[] args)
	{
		for(Season s : Season.values())
		{
			System.out.print(s+":");
			System.out.println(s.i);
		}
		
	}

}
