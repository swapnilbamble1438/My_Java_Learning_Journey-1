package com;

public class A3_Swap_two_num_without_using_third_variable {
	
	public static void main(String[] args) {
		
		int x = 1; 
		int y = 2;
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		
		
	}
}
