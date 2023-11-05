/*
 
 Access Modifiers              Non Access Modifiers
 
 public                        static
 private                       final
 protected                     abstract
 default (No Modifier)         synchronized
                               transient
                               volatile
                               strictfp
                               
 static keyword: 
 static keyword is a non-access modifier
 
 static variable can be used with
 class level variable and we cannot use with
 local variable.
 
 static keyword can be use with method also.
 
 static block can also be made
 
 static can be used with inner class(nested class) also
 but not with outer class.
 
 -------------------------------------------------------------
 
 
 */
package oops.Aa11;


public class Aa12_Static_keyword {
	
	static int count=0;
	
	public Aa12_Static_keyword() {
	
		count++;
		System.out.println(count);
	}
	

	public static void main(String[] args) {
			
		Aa12_Static_keyword c1 = new Aa12_Static_keyword();
		Aa12_Static_keyword c2 = new Aa12_Static_keyword();
		Aa12_Static_keyword c3 = new Aa12_Static_keyword();
		
	
		
	}
}
