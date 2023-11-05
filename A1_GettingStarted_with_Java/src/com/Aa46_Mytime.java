package com;
class Time
{
	int hour,min,sec;
	String date; 
	Time()
	{
		hour = 2;
		min = 20;
		sec = 40;
		date = "24 October";
	}
	
	Time(int h,int m,int s)
	{
		hour = h;
		min = m;
		sec = s;
	}
	Time(int h,int m,int s,String d)
	{
		hour = h;
		min = m;
		sec = s;
		date = d;
	}
	
	
	public void show() 
	{
	System.out.println("hour " + hour);
	
	System.out.println("min " + min);
	
	System.out.println("sec " + sec);
	
	System.out.println("date " + date);
	}
}
class Aa46_Mytime
{
	public static void main(String args[])
	{
		Time m1 = new Time();
		m1.show();
		Time m2 = new Time(12,44,23,"4 April");
		m2.show();
		
		
		
	}
}