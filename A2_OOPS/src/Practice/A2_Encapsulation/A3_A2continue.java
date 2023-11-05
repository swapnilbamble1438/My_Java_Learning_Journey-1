/*
	 Example explained
	The get method returns the value of the variable name.
	
	The set method takes a parameter (newName) and assigns it to
	 the name variable. The this keyword is used to refer to the 
	 current object.
	
	However, as the name variable is declared as private, we 
	cannot access it from outside this class:
 */


package Practice.A2_Encapsulation;

public class A3_A2continue {
	
	public static void main(String args[])
	{
		A2_get_and_set obj = new A2_get_and_set();
//		obj.name = "Swapnil";     wrong way (first try using this)
//		System.out.println(obj.name);    wrong way (first try using this)
		
		
		//If the variable was declared as public, we would expect the output: Swapnil
	
	// However, as we try to access a private variable, we get an error:
		
	//Instead, we use the getName() and setName() methods to access and update the variable:	
	
		obj.setName("Swapnil");
		System.out.println(obj.getName());
	
	
	}
}


/*
	 Why Encapsulation?
	1) Better control of class attributes and methods
	2) Class attributes can be made read-only (if you only use the
	 get method), or write-only (if you only use the set method)
	3)Flexible: the programmer can change one part of the code 
	without affecting other parts
	4)Increased security of data
 */

