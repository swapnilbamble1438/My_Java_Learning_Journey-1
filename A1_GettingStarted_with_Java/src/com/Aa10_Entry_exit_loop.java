package com;
// Display Welcome to Java for 10 times
 
import java.lang.String;
import java.util.Scanner;
class Aa10_Entry_exit_loop
{
    public static void main(String args[])
    {
	/* Program                                             
	int counter = 1;                                      
	while(counter <= 10)              // Entry Level Loop Program                
          {                                              
		System.out.println("Welcome to java");   
		counter = counter + 1;                   
		}                                        
	*/

	int counter = 100;      
	do{	                          // Exit Level Loop Program 
		System.out.println("Welcome to java");
		counter = counter + 1;
		
	   }while(counter <= 10);

	}
}
		