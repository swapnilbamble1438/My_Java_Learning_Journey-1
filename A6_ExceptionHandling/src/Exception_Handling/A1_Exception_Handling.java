/*
Exception:

if according to your daily routine
after waking up, we are going to office by motorcycle
so this is our normal flow
                                                                                            
                                                ___________  
                     _            _            /__Office___\ 
      _             (_)          (_) /         |  ___      | 
   __(_)___  -->    /|\   -->    /|\/\   -->   | |   |     |
  |     \  |        [|          _/_\__\        | |   |     |
                    / \        (_)  (_)        |_|   |_____| 
                     
                      
                      
                      
but suddenly one day our bike gets puncher and our 
next process will disturb(or flow will disturb) 
and where ever we want to reach at time we will get late.
so the event like bike getting puncher or if rain starts
suddenly  are called unexpected event or unwanted event.

so the event which we not have expected and which disturbs
our normal flow is called Exception.
                                  _____
                                 (     )
                                  (____)
                                  ''''
                                 ''''           ___________  
                     _          ''_''          /__Office___\ 
      _             (_)          (_) /         |  ___      | 
   __(_)___  -->    /|\   -->    /|\/\   -->   | |   |     |
  |     \  |        [|          _/_\__\        | |   |     |
                    / \        (_)  (x)        |_|   |_____| 
                     
 Exception:
 An exception is an unwanted or unexpected event, which occurs
 during the execution of a program i.e at run time, that 
 disrupts the normal flow of the program.     
 
 e.g
 
 class Test {
	
	public static void main(String[] args) {
		
		System.out.println("1");	
		System.out.println(100/0);
		System.out.println("2");
		
	}

}
	
	output: 1
		Exception in thread "main" java.lang.ArithmeticException: / by zero
	        at Exception_Handling.Test.main(Test.java:7)

        // here our normal flow has disturb
        // and our program has not fully executed successfully
        // so it is Exception.      
---------------------------------------------------------------------
Exception Handling:

To handle unwanted exception or event so that 
our flow will not disturb is called
Exception Handling
	OR
 The unwanted event occur which we have not 
 expected and if we find any alternate way so that
 our flow will not get disturb so that process 
 is called Exception Handling.
 
 e.g 1.
 if we are going some where and our bike
 gets puncher and if we kept our bike at
 some safe place and taken some other
 convenience to reach our target place.
 so here the unwanted event which had
 occured we had handle that event
 by using alternate way and our flow
 had also not disturbed and our 
 routine has normally executed so 
 this is Exception Handling.
 
 e.g 2.
 if rain starts heavily while going somewhere
 and at that time if we use raincoat
 or umbrella so its a alternate way
 so that out normal flow will not
 disturb and our routine will get
 excecuted successfully.
 this is Exception Handling.
 
 Exception Handling Advantage:
 Our program noraml flow will not disturb and
 our project or application will not crash
 
 NOTE: Exception Handling is not removing 
       Exception or repairing Exception.
       Exception Handling is to find
       alternate way when exception
       occurs and to execute program 
       successfully.
                    
                      
--------------------------------------------------------------                     
*/
package Exception_Handling;

public class A1_Exception_Handling {
	
	public static void main(String[] args) {
		
		System.out.println("1");	
		System.out.println(100/0);
		System.out.println("2");
	
		
		
	}

}
