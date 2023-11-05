package com;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Datediffer {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		LocalDate today = LocalDate.now();
		
		System.out.print("Enter Birth Year ");
		int year = sc.nextInt();
		
		System.out.print("Enter Birth Month ");
		int month = sc.nextInt();
		
		System.out.print("Enter Birth Date ");
		int date = sc.nextInt();  
		
		LocalDate birthday = LocalDate.of(year, month, date);
		
		Period period = Period.between(birthday, today);
		
		System.out.print(period.getYears() + "years" + period.getMonths() + "month" + " and" + period.getDays() + "days");

	}

}
