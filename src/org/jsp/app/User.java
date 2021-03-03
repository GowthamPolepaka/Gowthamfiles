package org.jsp.app;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User 
{
	/*
	 * int id; String name; String emailId; String num; public User(int id,String
	 * name,String emailId,String num2) { this.id = id; this.name = name;
	 * this.emailId = emailId; this.num = num2; }
	 */
	/*
	 * public User() { // TODO Auto-generated constructor stub }
	 */
	
	static String name;
	static String num;
	public void id()
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Id");
		String id = scan.next();
		try
		{
		if((Pattern.matches("[0-9]{2}", id)))
		{
			System.out.println("Your Id is"+" "+id);
		}
		else
		{
			throw new BookMyShowException("Enter valid Id");
		}
		}
		catch(BookMyShowException e)
		{
			System.err.println("ID should be of only Two Digits ");
			id();
		}
		
	}

	public void info() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		
		try
		{
			String name = scan.next();
			if ((Pattern.matches("[a-zA-Z]*", name))) 
			{
		
				System.out.println("Your name is"+" "+name);
			}

			else 
			{
				throw new BookMyShowException("Enter a valid Name ");
				
			}
		
		}
		catch(BookMyShowException e)
		{
			System.err.println("Enter Alphabets Only...");
			info();
			
		}
		}
	
	public void phoneNumber() 
	{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your Phone Number");
			String num = scan.next();
			try
			{
			if (Pattern.matches("\\d{10}", num))
			{
				
				System.out.println("Your phone number: " + num);

			}
			else 
			{
				throw new BookMyShowException("Please enter a valid Phone Number ");
			}
			}
			catch(BookMyShowException e)
			{
				System.err.println("Phone Number Should be of 10 digits..");
				phoneNumber();
			}
		
	
	}
	public void mail() 
	{
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your email Id");
			String emailId = scan.next();
			try
			{
			if ((Pattern.matches("[a-zA-Z0-9]*@.+.com", emailId))) 
			{
				System.out.println("Your mail id is: " + emailId);
				
			} 
			else
			{
				throw new BookMyShowException(" Please enter a valid Mail");
			}
			}
			catch(BookMyShowException e)
			{
				System.err.println("Please enter a valid mail Id");
				mail();
			}
	}

	/*
	 * public void login() { System.out.println(name);
	 * System.out.println("enter your registered name"); Scanner scanner=new
	 * Scanner(System.in); String names=scanner.next();
	 * System.out.println("enter your registered phone number"); String
	 * ph=scanner.nextLine(); try { if(names.equals(name)&&ph.equals(num)) {
	 * System.out.println("welcome "+names); } else { throw new
	 * BookMyShowException("kali pili lolluddu"); }
	 * 
	 * } catch (BookMyShowException e) { login();
	 * 
	 * }
	 */
	
	public void view()
	{
		id();
		info();
		phoneNumber();
		mail();
		System.out.println();
		System.out.println("Login to BookMyShow");
		//login();

	}
}
		
		
	


