/*
 Example of Armstrong number:
 371 = 3^3 + 7^7 + 1^1 = 27 + 343 + 1 = 371. 
 Therefore 371 is a Armstrong number.
 
 */

package Java_Basic_Programs;
/* Write a program to display Armstrong Number of 3 digits
   for eg. if given number is 371 then 
   (3*3*3) + (7*7*7) + (1*1*1)
    27 + 343 + 1 = 371
   as sum is matching with original number the given number is 
   Armstrong otherwise display not an Armstrong number
*/
//===================================================================
import java.util.Scanner;
class A5_Armstrong
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);

	System.out.println("Enter Number ");
      int no = sc.nextInt();
      int num = no;
      
	int rem = 0;
	int armno = 0;

	while(no > 0)
	{
		rem = no % 10;
		rem = rem * rem * rem;  
	 	armno = armno + rem;
	 	no = no / 10;
	}

	
		if(num == armno)
			System.out.println("Given Number is Armstrong Number");
		else
			System.out.println("Given Number is not an Armstrong Number");
      }
}
