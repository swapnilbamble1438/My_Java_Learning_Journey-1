/*
 Example
Throw an exception if age is below 18 
(print "Access denied"). If age is 18 or older, 
print "Access granted":
 */
package Exception_Handling;

public class Ca23iii_throw_keyword {

	static void checkAge(int age) {
		
		if(age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");	
			}
		else {
			System.out.println("Access granted - You are old enough!");
		}
	}
	
	public static void main(String args[])
	{
		checkAge(15);
		
	}
}
// The output will be in error if it does not satisfies
// condition.
