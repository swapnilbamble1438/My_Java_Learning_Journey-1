/*
	Uses of "this" keyword
	
	1. this keyword can be used to refer current class instance variable.
	2. this keyword can be used to invoke current class method(implicitly).
	3. this() can be used to invoke current class constructor.
	4. this can be used to pass as an argument in the method call.
	5. this can be used to pass an an argument in the constructor call.
	6. this can be used to return the current class instance from the method.
-------------------------------------------------------------------------------------------

1. this keyword can be used to refer current class instance variable.
 
 e.g: 
 
class Test
{
	int i;
	
	void setValue(int i)
	{
		this.i = i;
	}
	
	void show()
	{
		System.out.println(i);
	}
	
	public static void main(String[] args)
	{
	 	Test t = new Test();
	 	t.setValue(4);
	 	t.show();
	}
}
	
	output: 4
	
------------------------------------------------------------------------------------------	

2. this keyword can be used to invoke current class method(implicitly).

e.g:

class Test
{
	void display()
	{	
		System.out.println("hello");
	}
	
	void show()
	{                       // if you don't use this keyword,
		// display();       // compiler automatically adds
		this.display();     // this keyword while invoking
	}                       // the method
	
	 public static void main(String args[])
	 {
	 	Test t = new Test();
	 	t.show();
	 }
}	 
	
	output: hello
	
------------------------------------------------------------------------------------------	

3. this() can be used to invoke current class constructor.

e.g:

class Test
{

	Test()
	{
		System.out.println("no arg constructor");
	}
	
	Test(int a)
	{
		this();
		System.out.println("parameterised constructor");	
	}
	
	public static void main(String[] args)
	{
		Test t = new Test(10);
	}
}	

	output: no arg constructor
			parameterised constructor
		
------------------------------------------------------------------------------------------

3. this() can be used to invoke current class constructor.

e.g: 

class Test
{
	Test()
	{
		this(10);
		System.out.println("nor arg constructor");
	}
	
	Test(int a)
	{
		System.out.println("parameterised constructor");
	}	
	
	public static void main(String[] args)
	{
		Test t = new Test();
	}
}		

	output: parameterised constructor
			nor arg constructor
			
------------------------------------------------------------------------------------------
			
4. this keyword can be used to pass as an argument	
   in the method call
   		
e.g:

class Test
{
	void m1(Test t)
	{
		System.out.println("I am in m1 method");
	}
	
	void m2()
	{
		m1(this);
	}	
	
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m2();
	}
}	
	
	output: I am in m1 method
		
------------------------------------------------------------------------------------------

5. this keyword can be used to pass as an
   argument in the constructor call.
   
e.g:

class Test
{
	Test(Main m)
	{
		System.out.println("Test class constructor");
	}
}

public class Main
{
	void m1()
	{
		Test t = new Test(this);
	}
	
	public static void main(String[] args)
	{
		Main m = new Main();
		m.m1();
	}	
}
   
   output: Test class constructor
 
------------------------------------------------------------------------------------------   

6. this can be used to return the current class
   instance from the method.
   
e.g:

class Test
{
	Test t()
	{
		System.out.println("Hello");
		return this;
	}
	
	public static void main(String[] args)
	{
		Test obj = new Test();
		obj.t();
	}
}

	output: Hello
	
------------------------------------------------------------------------------------------
*/

package oops.Aa13_OOPS_InOneGo;



public class A8_Use_of_this_keyword {
	
	A8_Use_of_this_keyword t()
	{
		System.out.println("Hello");
		return this;
	}
	
	public static void main(String[] args)
	{
		A8_Use_of_this_keyword obj = new A8_Use_of_this_keyword();
		obj.t();
	}
}
