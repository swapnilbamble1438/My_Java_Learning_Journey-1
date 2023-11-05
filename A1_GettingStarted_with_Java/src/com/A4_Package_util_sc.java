package com;
import java.util.Scanner;
class A4_Package_util_sc
{
       public static void main(String args[])
       {
         // i want to create an object of scanner class as scanner class
         // is used to accept data from the device mapped to it

         Scanner sc = new Scanner(System.in);  

         // here sc is name of scanner object 
         // System.in means keyboard so obj will accept data from keyboard

         System.out.print("enter first number");
         int x = sc.nextInt();
        
         System.out.println("enter second number"); 
         int y = sc.nextInt();

         int z = x + y;
         System.out.println(z);
         }
}