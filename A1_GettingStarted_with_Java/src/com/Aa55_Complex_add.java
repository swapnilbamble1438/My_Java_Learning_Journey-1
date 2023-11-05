package com;
/*
Q) Design three constructors for the same class named
   "Complexaddition".
   []The first constructor should be the default constructor
   having no arguments.
   It is used to create objects which are not initialized.
   []The second constructor takes one argument, it is used 
   to create objects and initialize them.
   []The third constructor takes two arguments, it is also
   used to create objects and initialize them.
   []Create a method "sum" which takes two arguments of 
   type complexaddition
   and also return a value of  type complexaddition.
   Use this method to perform the addition of two 
   complex numbers of type  complexaddition.
   Class "complexaddition" also has two data members
   named real and imaginary.
=============================================================*/   
class Complex
{
	int real, img;
	Complex()
	{
		
	}
	Complex(int r)
	{
		this.real = r;
		
		}
	Complex(int r, int i){
		this.real = r;
		this.img = i;
	}
	void show()
	{
		System.out.println(this.real + "+i" + this.img);
		
	}
	public static Complex sum(Complex n1, Complex n2) 
	{
		Complex res = new Complex();
		
		res.real= n1.real + n2.real;
		
		res.img= n1.img + n2.img;
		
		return res;
		
	}
}
class Aa55_Complex_add
{
	public static void main(String args[])
	{
		Complex c1 = new Complex(4,5);
		System.out.println("First Complex number: ");
		c1.show();
		
		Complex c2 = new Complex(7,8);
		System.out.println("Second Complex number: ");
		c2.show();
		
		Complex res = Complex.sum(c1,c2);
		
		System.out.println("Sum is: ");
		res.show();
		
	}
}

