package DSA_Java;

import java.util.Scanner;

/*
 Q) Create Flowchart for below business logic
 
 Suppose for an insurance company, a premium calculation routine is required based on the following logic:
-	If there are zero dependents set the premium to rs.1000.00
-	If there are 2 or less dependents set the premium to rs. 1000 + rs. 750 for each dependent
-	If there are 3 or more dependents then set the premium to rs.1000 + rs. 500 for each additional dependent

-	If the total premium is less than rs. 2000 update the Membership Status to ACTIVE
-	If the total premium is equal or more than rs. 2000 update the Membership Status to PENDING

Make a flowchart for above logic in paper or any software and then send it to brajan@prevor.com  email.
 
 */



public class Main {
	public static void main(String[] args)  {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter number of Dependents");
		int dep = sc.nextInt();
		
		int pre = 0;
		
		if(dep == 0)
		{
			pre = 1000;
		}
		else if(dep <= 2 && dep != 0)
		{
			pre = 1000 + (dep*750);
		}
		else if(dep >= 3)
		{
			pre = 1000 + (dep * 500);
		}	
		System.out.println("Premium: Rs. " + pre);

		if(pre < 2000)
		{
			System.out.println("Membership Status: Active");
		}
		else if(pre >= 2000)
		{
			System.out.println("Membership Status: Pending");
		}
				
	}
}
