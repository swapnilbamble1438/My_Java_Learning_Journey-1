package com;

		interface Abc 
		{
	
			public void show();
			public void display();
		
		}
		interface Bbc 
		{
			public void showme();
			public void display();
		}
		class Interface implements  Abc, Bbc
		{
			@Override
			public void show()
			{
				System.out.println("show of interface from Abc");
			}
			
			@Override
			public void showme()
			{
				System.out.println("showme of interface from Bbc");
		     }
			
			@Override
			public void display()
			{
				System.out.println("display of interface from Abc");
			}
		}
		public class Aa63_Interface
		{
			public static void main(String[] args)
			{
				Abc a1 = new Interface();
				a1.show();
				a1.display();
				
				Bbc b1 = new Interface();
				b1.showme();
				b1.display();
			}
		}
