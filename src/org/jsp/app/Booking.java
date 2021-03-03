package org.jsp.app;


import java.util.EnumSet;
import java.util.Scanner;


public class Booking 
{
	public void display()
	{
		System.out.println("Availble seats");
		EnumSet<SeatType> set1 = EnumSet.allOf(SeatType.class) ;
		System.out.println(set1);
		System.out.println("Select your seat");
	}
	
	public void rangasthalam() throws BookMyShowException
	{
		
		Scanner scan = new Scanner(System.in);
		/*
		 * System.out.println("availble seats"); EnumSet<SeatType> set1 =
		 * EnumSet.allOf(SeatType.class) ; System.out.println(set1);
		 */
		//System.out.println("select your seat");
		String s=scan.next();
		System.out.println("These are the Availabe seats and their prices");
		for (SeatType seatType : SeatType.values())
		{
			System.out.println(seatType+" "+'-'+" "+seatType.value);
			
		}
		System.out.println("Select no of seats");
		int seats = scan.nextInt();
		int bill = 0;
		System.out.println("Your Bill for the Tickets");
		for(SeatType seatType : SeatType.values())
		{
			 bill = seats * seatType.value;
		}
		System.out.println(bill);
		
		System.out.println("Confirm your seat");
		String s2 = scan.next();
		if(s2.equals(s))
		{
			System.out.println("Thanks for Booking...");
			System.out.println("Your Booking is confirmed");
		}
		else
		{
			throw new BookMyShowException("");
			//System.out.println("Your Confirmation was invalid");
			//System.out.println("Please select the valid seat");
		}
		
	   }
	
	
	public void pushpa()
	{
		try
		{
		Scanner scan = new Scanner(System.in);
		/*
		 * System.out.println("availble seats"); EnumSet<SeatType> set1 =
		 * EnumSet.allOf(SeatType.class) ; System.out.println(set1);
		 */
		//System.out.println("select your seat");
		String s=scan.next();
		System.out.println("These are the Availabe seats and their prices");
		for (SeatType seatType : SeatType.values())
		{
			System.out.println(seatType+" "+'-'+" "+seatType.value);
			
		}
		System.out.println("Confirm your seat");
		String s2 = scan.next();
		if(s2.equals(s))
		{
			System.out.println("Thanks for Booking");
			System.out.println("Your Booking is confirmed");
		}
		else
		{
			System.out.println("Your Confirmation was invalid");
			System.out.println("Please select the valid seat");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void uppena()
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			/*
			 * System.out.println("availble seats"); EnumSet<SeatType> set1 =
			 * EnumSet.allOf(SeatType.class) ; System.out.println(set1);
			 */
			//System.out.println("select your seat");
			String s=scan.next();
			System.out.println("These are the Availabe seats and their prices");
			for (SeatType seatType : SeatType.values())
			{
				System.out.println(seatType+" "+'-'+" "+seatType.value);
				
			}
			System.out.println("Confirm your seat");
			String s2 = scan.next();
			if(s2.equals(s))
			{
				System.out.println("Thanks for Booking");
				System.out.println("Your Booking is Confirmed");
			}
			else
			{
				System.out.println("Your Confirmation was invalid");
				System.out.println("Please select the valid seat");
			}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
	}
	public void ZombieReddy()

	{
		try
		{
	
		Scanner scan = new Scanner(System.in);
		/*
		 * System.out.println("availble seats"); EnumSet<SeatType> set1 =
		 * EnumSet.allOf(SeatType.class) ; System.out.println(set1);
		 */
		//System.out.println("select your seat");
		String s=scan.next();
		System.out.println("These are the Availabe seats and their prices");
		for (SeatType seatType : SeatType.values())
		{
			System.out.println(seatType+" "+'-'+" "+seatType.value);
			
		}
		System.out.println("Confirm your seat");
		String s2 = scan.next();
		if(s2.equals(s))
		{
			System.out.println("Thanks for Booking");
			System.out.println("Your Booking is Confirmed");
		}
		else
		{
			System.out.println("Your Confirmation was invalid");
			System.out.println("Please select the valid seat");
		}
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		
	

	
	


}
