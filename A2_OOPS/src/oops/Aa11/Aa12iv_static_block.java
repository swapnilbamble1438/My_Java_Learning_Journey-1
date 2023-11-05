/*
 
static block:
	
	e.g:
	class Test
	{
		static
		{
		
		}
	}
	
Q) how we call static block?

	there is no way of calling staic block.
	static block executes automatically when 
	the class is loaded in the memory.
	
	e.g:
	
	class Test
	{
		static
		{
			System.out.println("Hello");
		}
	}
	
	Q) so here without main method will it execute
	   code inside static block ?
	Ans Yes (but it is only possible in version
	    before jdk 1.6)
	    
	   output: Hello    // here output will be possible  
                        // only in versions before
                        // jdk 1.6 
                          
 	e.g: after jdk 1.6 versions
 	
 	class Test
	{
		static
		{
			System.out.println("Hello");
		}
		
		public static void main(String args[])
		{
			System.out.println("Hii");
		}
	}
		output: Hello
		        Hii
				
so now main method is necessay for executing static block				
----------------------------------------------------------	
     flow of static block:
 	
     before jdk 1.6
     if the class has multiple staic block
     then the flow of static block was 
     according to their sequence.
     and in last main method will execute.
 	
     but after jdk 1.6 
     it will identify static members from top to 
     bottom and after that it will check if main method is present
     or not, if not then it will show error
     else if main method is present it 
     execute the static block according to their
     occurence and atlast it will executes
     main method. and through main methods
     only all static methods, methods will be
     executed.
     
     Q) can we make multiple staic block inside
        one class
     Ans Yes, and its execution will be from
     	 top to bottom, means according to their
     	 sequence they will get executed.
     	
    e.g:
    
    class Test
    {
    
    	public static void main(String args[])
     	{
     		System.out.println("Swapnil");
     	}
     	
     	static
     	{
     		System.out.println("Hii");
     	}
     		
     	static
     	{
     		System.out.println("Hello");
     	}
     	
     		
     }	
        output: Hii
                Hello
                Swapnil
 	
----------------------------------------------------------
 Use of static block:
 
 1. static block is executed at class loading.
    hence at the time of class loading if we
    want to perform any activity, we have to 
    define that inside static block.
    
    native methods are written in static block.
    the code for loading native methods are 
    written inside static block.
    
 2. static block is used to initialize the 
    static members.
    
    class Test
    {
    	static int a;
    	
    	static 
    	{
    		 a = 10;
    	}
    	
    	public static void main(String args[])
    	{
    	
    	}
    	
     }		 
 
 */


package oops.Aa11;

public class Aa12iv_static_block 
{
static
{
	System.out.println("hii");
}
static
{
	System.out.println("Swapnil");
}
 public static void main(String[] args) {
	
}
}
