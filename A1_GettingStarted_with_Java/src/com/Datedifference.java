package com;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Datedifference {

	static void find(String firstdate, String lastdate)
	{
		SimpleDateFormat s1 = new SimpleDateFormat("dd-MM-yyyy");
		try {
		Date date1 = s1.parse(firstdate);
		Date date2 = s1.parse(lastdate);
		
		long time_difference = date1.getTime() - date2.getTime();
		long days_difference= (time_difference/(1000*60*60*24)) % 365;
		
		System.out.println("Difference between 2 dates is " + days_difference + " days");
	} catch(ParseException ex)
		{
		ex.printStackTrace();
		}
	
	}	
	
	
	
	public static void main(String[] args) 
	{
		String firstdate = "12-12-2022";
		String lastdate= "1-02-2020";
		
		find(firstdate,lastdate);

	}

}
