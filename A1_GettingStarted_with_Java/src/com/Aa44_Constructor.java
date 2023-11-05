package com;
import java.util.Scanner;
class Const
{
	public static int add(int x, int y)
	{
		int z= x + y;
		return z;
	}
	Const()
	{
		System.out.println("Welcome to Constructor ");
	}
	Const(int x)
	{
		System.out.println("This is int type of Constructor ");
	}
	Const(float y)
	{
		System.out.println("This is float type of Constructor ");
	}
	Const(int a, float b)
	{
		System.out.println("This is int and float type of Constructor" );
	}
	
}
class Aa44_Constructor
{
	public static void main(String args[])
	{
		System.out.println("Addition "+ Const.add(55,76));
		
		Const c1 = new Const();
		Const c2 = new Const(1);
		Const c3 = new Const(2f);
		Const c4 = new Const(3,4f);
	}
}