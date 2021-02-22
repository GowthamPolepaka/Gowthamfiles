package org.trainingDay7;

public class Enum1 
{
	public enum Week {FRIDAY,SUNDAY,MONDAY,TUESDAY,WEDNESDAY}
	{
		System.out.println("Days in a week");
	}
	public static void main(String[] args) 
	{
		for(Week w : Week.values())
		{
			System.out.println(w);
		}
		
	}

}
