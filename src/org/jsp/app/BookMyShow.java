package org.jsp.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookMyShow 
{
	public static void main(String[] args) throws BookMyShowException 
	{
		
		System.out.println("Welcome to BookMyShow");
		User user=new User();
		user.view();
				//user.login();
		/*
		 * int i = user.id; String n = user.name; String e = user.emailId; String p =
		 * user.num;
		 */
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Rangasthalam");
		a1.add("Pushpa");
		a1.add("Uppena");
		a1.add("ZombieReddy");
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Sudharshan 35MM");
		a2.add("Sandhya 70MM");
		a2.add("Devi 70MM");
		a2.add("Sandhya 35MM");
		
		Iterator iterator = a1.iterator();
		System.out.println("Now Showing..");
		System.out.println("The list of Movies ");
		while(iterator.hasNext())
		{
			Object o1 = iterator.next();
			String s1 = (String)o1;
			System.out.println(s1);
		}
		Movie movie = new Movie();
		String movieName = movie.film();
		System.out.println();
		Iterator iterator2 = a2.iterator();
		System.out.println("The List Of Theaters");
		while(iterator2.hasNext())
		{
			Object o2 = iterator2.next();
			String s2 = (String)o2;
			System.out.println(s2);
		}
		
		Theatre theatre = new Theatre();
		theatre.cinema();
		Booking1 booking = new Booking1();
		booking.display();
		booking.conformBooking(movieName);

		
	}
				
		
}


