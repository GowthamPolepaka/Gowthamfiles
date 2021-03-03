package org.jsp.app;

import java.util.EnumSet;
import java.util.Scanner;

public class Booking1 
{
	public void display()
	{
		System.out.println("Availble seats");
		EnumSet<SeatType> set1 = EnumSet.allOf(SeatType.class) ;
		System.out.println(set1);
		System.out.println("Select your seat");
	}
	

	public void conformBooking(String movieName) throws BookMyShowException
	{
		try
		{
		Scanner scan = new Scanner(System.in);
 
		String s = scan.next();
		System.out.println("These are the Availabe seats and their prices");
		for (SeatType seatType : SeatType.values())
		{
			System.out.println(seatType+" "+'-'+" "+seatType.value);
			
		}
		System.out.println("Select no of seats");
		int seats = scan.nextInt();
		int bill = 0;
		//System.out.println("Your Bill for the Tickets");
		for(SeatType seatType : SeatType.values())
		{
			 bill = seats * seatType.value;
		}
		System.out.println("Your Bill for the Tickets"+" "+bill);
		System.out.println("Confirm your seat");
		String s2 = scan.next();
		
		if(s2.equals(s))
		{
			System.out.println("Thanks for Booking...");
			System.out.println("Your Booking for"+" "+movieName+" "+"is confirmed...");
		}
		else
		{
			throw new BookMyShowException("Your Confirmation was invalid");
		}
		
		}
		catch(BookMyShowException e)
		{
			System.out.println("Your confirmation was invalid");
			conformBooking(movieName);
		}
	}

}
