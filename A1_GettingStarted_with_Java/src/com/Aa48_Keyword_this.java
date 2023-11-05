package com;
/*
Many a times member variable name  and parameter name is same.
then for referring member variable we use this keyword 
this is used for referring current class.
 */
class Aa48_Keyword_this
{
	int hour, min;
	String date;
	
	Aa48_Keyword_this()
	{
		hour =7;
		min = 30;
		
	}
	Aa48_Keyword_this(int hour, int min)
	{
		this.hour = hour;
		this.min = min;
		
	}
	public void show()
	{
		System.out.println("hour " + hour);
		
		System.out.println("min " + min);
		
	}
	public static void main(String args[])
	{
		Aa48_Keyword_this k = new Aa48_Keyword_this();
		
		k.show();	
		
		Sec_date sd = new Sec_date();
		
		sd.show();
	}
}
class Sec_date
{
	int sec;
	String date;
	
	Sec_date()
	{
		sec = 45;
		date = "7 April";
	}
	Sec_date(int sec, String date)
	{
		this.sec = sec;
		this.date = date;
	}
	public void show()
	{
		System.out.println("sec " + sec);
		
		System.out.println("date " + date);
	}
	
}