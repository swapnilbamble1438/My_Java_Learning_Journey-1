package com;
class Aa19_Break_continue
{
    public static void main(String args[])
    {
	System.out.println("This is before loop");
	
      for(int i = 1; i <= 10; i ++)
	  {
		System.out.println("Value of i is " + i);
		
		if(i == 5)  // (i ==7 || i == 8) "||" it stands for or
           {
		// break;
		   continue;
		   // return;

		  
      	   } 
		    System.out.println("Bye Bye Value of i " + i);
      } 
       System.out.print("This is after loop");
    }

}