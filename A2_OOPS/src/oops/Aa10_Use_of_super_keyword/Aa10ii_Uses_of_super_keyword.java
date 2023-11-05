/*
Uses of "super" keyword

1. "super" keyword can be used to refer 
   immediate parent class instance variable.
2. "super" keyword can be used to invoke
   immediate parent class method.
   	 OR
   From using super keyword we can call method
   of a parent class from subclass	 
3. super() can be used to invoke immediate parent
   class constructor.      
   
   
   Use 1 E.g:
   
   class A
   {
   		int i = 10;
   }
   class B extends A
   {
   		int i = 20;
   		
   		void show(int i)
   		{
   			System.out.println(i);
   			System.out.println(this.i);
   			System.out.println(super.i);
   			
   		}
   		
   		public static void main(Strings[] args)
   		{
   			B objb = new B();
   			objb.show(30);
   		
   		}
   }	
   	output: 30
   			20
   			10
   			
   so if we take same name of variable in 
   parent and subclass than we can distinguish
   this variable by using super and this keyword.
   so there will be no chances of coming 
   ambiguity error and compiler will also
   not get confuse between same name of variables.
   
-------------------------------------------------------------
	
	Use 2 E.g.1):
	
	class A
   {
   		void m1()
   		{
   			System.out.println("I am in class A");
   		
   }
   class B extends A
   {
   		
   		void show()
   		{
   			super.m1();
   		}
   		
   		public static void main(Strings[] args)
   		{
   			B objb = new B();
   			objb.show();
   		
   		}
   }	
   	output: I am in class A
   			
----------------------------------------------------------

	Use 2 E.g.2):
	
		
	class A
   {
   		void m1()
   		{
   			System.out.println("I am in class A");
   		
   }
   class B extends A
   {
   		void m1()
   		{
   			System.out.println("I am in class B");
   		}	
   		
   		void show()
   		{
   			m1();
   			super.m1();
   		}
   		
   		public static void main(Strings[] args)
   		{
   			B objb = new B();
   			objb.show();
   		
   		}
   }	
   	output: I am in class B
   	  		I am in class A

---------------------------------------------------
	without using super keyword
	Use 3 E.g.1):
	
	class A
	{
		A()
		{
			System.out.println("I am in class A");
		}	
	}
	class B extends A
	{
		B()
		{
			super(); // without adding this super() 
					// it will automatically inserted but 
					// it will not visible in default
					// (no args constructor) only 
					// otherwise parameterized constructor
					// will be visible
					// and get called before base class
					// constructor
			System.out.println("I am in class B");
		}
	
		public static void main(String[] args)
		{
			B objb = new B();
		}	
	
	}
	output: I am in class A
			I am in class B
		
	so compiler here is automatically called the 
	constructor of class A	
	
	
-----------------------------------------------------
	
	Using super keyword
	Use 3 E.g.2):
	
	class A
	{
		A(int a)
		{
			System.out.println("I am in class A");
		}	
	}
	class B extends A
	{
		B()
		{
			super(); // without adding this super() 
					// it will automatically inserted 
					// and get called before base class
					// constructor
			System.out.println("I am in class B");
		}
	
		public static void main(String[] args)
		{
			B objb = new B(4);
		}	
	
	}
	output: I am in class A
			I am in class B
		
	so we got same output
	
-----------------------------------------------------

Difference Between super and super();

     super 			  super()
     
super is keyword         super() is use to call
     		          constructor of parent class

-----------------------------------------------------		
	
	
			
			
			


*/

package oops.Aa10_Use_of_super_keyword;


class A
{
	
//	A()
//	{
//		System.out.println("default constructor from A class");
//	}
	
	A(int a)
	{
		System.out.println("parameterized constructor from A class");
	}
	
}

public class Aa10ii_Uses_of_super_keyword extends A{

	
	
	Aa10ii_Uses_of_super_keyword(int a) {
		super(a);
		System.out.println("from main class");
	}

	public static void main(String[] args)
	{
		Aa10ii_Uses_of_super_keyword obj = new Aa10ii_Uses_of_super_keyword(5);
		
	}
	
		

	
	
	

}
