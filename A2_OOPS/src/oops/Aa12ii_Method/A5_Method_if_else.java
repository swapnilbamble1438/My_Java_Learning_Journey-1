package oops.Aa12ii_Method;

public class A5_Method_if_else {

	// step 1 : create a checkAge() method
	// with an integer parameter called age
	
	static void checkAge(int age)
	{
		// step 2 : in this method
		
		// step 3 : if age is less than 18,
		// print "access denied"		
		if(age < 18)
			System.out.println("Access denied - You are not old enough!");
		
		
		// step 4 : if age is greater than, or equal to, 18,
		// print "access granted"
		else
			System.out.println("Access granted - You are old enough!");
		
	}
	
	// step 5: Now create main method to call this method
	public static void main(String args[])
	{
		// step 6 : now call this method and put value of age in it
		checkAge(20);
	}
	
}
