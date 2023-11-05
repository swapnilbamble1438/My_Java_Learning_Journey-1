/*
	 Get and Set
	 
	You learned from the previous chapter that private variables 
	can only be accessed within the same class (an outside class 
	has no access to it). However, it is possible to access them 
	if we provide public get and set methods.
	
	The get method returns the variable value, and the set method 
	sets the value.
	
	Syntax for both is that they start with either get or set, 
	followed by the name of the variable, with the first letter 
	in upper case:
 */

package Practice.A2_Encapsulation;

public class A2_get_and_set {

	private String name; // private = restricted access
	
	// Getter
	public String getName() {
		return name;
	}
	
	// Setter
	public void setName(String newName) {
		this.name = newName;
	}
	
	
}

// see the next class 
