/*

 Various Possible combination of
 try catch and finally block:
 
 --------------------------
 only try block:
---------------------------- 
 try      //    \  /
 {        //     \/   Not Possible
          //	 /\
 }        //    /  \
---------------------------`
 only catch block:
---------------------------- 
 catch      //     \  /
 {          //      \/   Not Possible
      	    //      /\
 }          //     /  \
------------------------------ 
 only finally block: 
------------------------------ 
 try        //   \  /
 {          //    \/   Not Possible
      	    //    /\
 }          //   /  \
-------------------------------- 
try catch block:
---------------------------------
 try
 {         //       /
           //      /      Possible          
 }         //    \/
 catch(Exception e)
 {
 
 }
-----------------------------------------------
try catch catch(try with multiple catch block):
------------------------------------------------
 try
 {                               
                        
 }                      //    \    /
 catch(Exception e)     //     \  /  Not possible
 {                      //      \/    
                        //      /\	  if there is parent Exception 
 }                      //     /  \       class in first try block
 catch(Exception e)     //    /    \      then second catch block will
 {                      //                not possible to apply
 
 }
------------------------------------------------
try catch catch(try with multiple catch block):
------------------------------------------------
 try
 {                               
                        
 }                              //     /
 catch(ArithmeticException e)   //    / Possible
 {                              //  \/      
                        	//   if there is child Exception 
 }                              //   class in first catch block
 catch(Exception e)             //   then second catch block will
 {                              //   be possible to apply with 
                                //   any Exception class(parent                           
 }                              //   or child Exception class)
 			        //   but not with same Exception 
 			        //   class which is already provided
 				//   in first catch block.
-------------------------------------------------------------
try catch block inside try catch block ( nested try catch):
-------------------------------------------------------------
 try 
 {
 	 try 
	 {                     
	                        //        /
	 }                      //       /   Possible
	 catch(Exception e)     //     \/ 
	 {
	 
	 }
 }
 catch(Exception e)
 {
 
 }
---------------------------------------------------------------
try catch block inside catch block:
--------------------------------------------------------------
 try 
 {
	                             
 }                         
 catch(Exception e)       
 {
	  try 
	 {
	                         //       /
	 }                       //      /   Possible
	 catch(Exception e)      //    \/ 
	 {
	 
	 }
 }
---------------------------------------------------------------
try catch finally block:
--------------------------------
 try 
 { 
                            //      /
 }                          //     /   Possible
 catch(Exception e)         //   \/ 
 {
	 
 }
 finally
 {
	 
 }
---------------------------------------------------------
 try finally block:
 -------------------

 try
 {
               //      / 
 }             //     /  Possible
 finally       //   \/
 {
 
 }
 ---------------------------------------------
 try catch block inside try finally block:
 ---------------------------------------------
 try
 {
                 
 }              
 finally     
 {
 	 try 
	 {
	                          //      /
	 }                        //     /   Possible
	 catch(Exception e)       //   \/ 
	 {
	 
	 }
 }
-------------------------------------------------- 
 try finally catch block:
 -------------------------------
 try 
 {
	                             
 } 
 finally                //    \    /
 {                      //     \  /
                        //      \/  Not Possible
 }                      //      /\
 catch(Exception e)     //     /  \ 
 {                      //    /    \
	 
 }
------------------------------------------------------
try block, print or any Statement, then catch block:
------------------------------------------------------
 try
 {
                                  //    \    /
 }                                //     \  /
 System.out.println("Hello");     //      \/   Not Possible
 catch(Exception e)               //      /\ 
 {                                //     /  \
                                  //    /    \
 }
----------------------------------------------------------------

 */

package Exception_Handling;


public class A8_Various_Combination_of_try_catch_finally {

	public static void main(String[] args) {
		
		 
		
	}
}
