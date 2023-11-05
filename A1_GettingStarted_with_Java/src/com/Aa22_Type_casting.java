package com;
/* Type Casting
 Type casting means converting lower data type into
 higher datatype or
 converting higher datatype into lower data type.
 
when we convert one type into another it is called as 
type casting (conversion)
Type casting is of two types : 
1) Upcasting (implicit type casting) : when a lower datatype is 
assigned to higher data type.
This is automatic.
2) Downcasting (explicit type casting) : when a higher datatype is
assigned to a lower data type.
This need to be specified if not then compiler
generates an error
*/
//=================================================================
class Aa22_Type_casting
{
    public static void main(String args[])
    {
//==================================================================    	
	// implicit type casting:
    	
    // example 1):
    
	   int no = 223;
	   float no1 = no;
   	   System.out.println("The value of no1 is " + no1);
	
   
	/*here no is int and no1 is float so they are incompatilbe
	still casting is done automatically as float is bigger than
	int.
	so we call this casting as Upcasting */
    	
    // example 2):
  
       byte x = 10;
       int y = x;
       System.out.println("Value of y is " + y); 	
     
//==================================================================
    // explicit type casting:
    		
   /* Program
	   float t = 233.44f;
	   int u = t;
	   System.out.println("The value of u is " + u);
	   */
	
	
	/* here x is float and y is int so they are incompatible
	here compiler generates an error as there is a chance of 
	loss of value
	Because of x can't be totally stored by y */
//====================================================================

	/* if still we want to convert then we have to do
	 Explicit Casting also called as Downcasting */

    // example 1):	 
	
	   float p = 233.44f;
	   int q = (int)p;
	   System.out.println("The value of q is " + q);
 	

	/* but here we will only able to see the value of 
       y = 233 and the factorial number after integer will be not 
       shown as y is integer */
    
    // example 2):
   
       int r = 10;
       byte s = (byte)r;
       System.out.println("Value of s is " + s);
   


    }

}