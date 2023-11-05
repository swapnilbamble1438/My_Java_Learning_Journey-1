package com;

class Aa54ii_vrp
{
	

    int a=10; 
    
    Aa54ii_vrp()
    {
    a=increment(a);
   
	}
    
    static int increment(int x)
	{
	 x=12;
	 return x;
	}
	void display()
	{
		 System.out.println("a after " + a);
	}
	
	
	public static void main(String args[])
	{
		Aa54ii_vrp c1 = new Aa54ii_vrp();
		c1.display();
	}
  
   
}

