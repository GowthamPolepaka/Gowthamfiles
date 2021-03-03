package org.jsp.app;
 
import java.util.Scanner;

public class Movie 
{
	public String film() throws BookMyShowException
	{
		System.out.println("Select Movie from the list");
		Scanner scan = new Scanner(System.in);
		String s2 = scan.next();
		try
		{
		switch(s2)
		{
		case  "Rangasthalam" :
		System.out.println(s2);
		break;
		case "Pushpa" :
		System.out.println(s2);
		break;
		case "Uppena" :
		System.out.println(s2);
		break;
		case "ZombieReddy" : 
		System.out.println(s2);
		break;
		default:
		throw new BookMyShowException("movie you looking dosent exist!");
		
		}
		}
		catch(BookMyShowException e)
		{
			System.err.println("Movie you are looking dosen't Exist");
			film();
		}
		
		return s2;
	
		
	}
	
	
}

