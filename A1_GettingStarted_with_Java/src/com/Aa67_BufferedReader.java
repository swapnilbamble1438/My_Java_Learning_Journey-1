package com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Aa67_BufferedReader
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader brk = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Name");
		String s = brk.readLine();
		System.out.println("Entered name " + s);
	}
	
}
