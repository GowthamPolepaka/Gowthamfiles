package org.jsp.app;

import java.util.Scanner;

public class Theatre 
{
	public String cinema() throws BookMyShowException
	{
		Theatre t1 = new Theatre();
		Scanner scan = new Scanner(System.in);
		System.out.println("Select the Theatre...");
		String s3 = scan.nextLine();
		try
		{
		switch(s3)
		{
		case "Sudharshan 35MM":
		System.out.println(s3);
		break;
		case "Sandhya 70MM":
		System.out.println(s3);
		break;
		case "Devi 70MM":
		System.out.println(s3);
		break;
		case "Sandhya 35MM":
		System.out.println(s3);
		break;
		default:
		throw new BookMyShowException("The Theatre you are looking was not available");
		}
		}
		catch(BookMyShowException e)
		{
			System.err.println("The theatre you are looking was not availabe");
			cinema();
		}
		return s3;
		
		}
		
	}
		


