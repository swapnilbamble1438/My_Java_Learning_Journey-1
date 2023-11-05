package Java_Number_Programs;

import java.util.Scanner;

public class A6ii_Check_Tech_num {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 4 digit Number: ");
		int no = sc.nextInt();
		
		int a = no / 1000;
		int b = (no / 100) % 10;
		int c = (no % 100) / 10;
		int d = no % 10;
		
		System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
		
		int firsthalf = no / 100;
		int secondhalf = no % 100;
		
		System.out.println("firsthalf=" + firsthalf + " secondhalf=" + secondhalf);
		
		
		int sum = firsthalf + secondhalf;
		
		if(no == sum * sum)
			System.out.println("The number "+no +" is a Tech number.");
		else
			System.out.println("The number "+no +" is not a Tech number.");
		
	}
}
