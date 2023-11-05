package oops.A7_overriding_n_overridden;

// public > protected > default > private

// always keep access modifiers same in both methods
// also child class method can be keep less protected
// from parent class method

 class P
 {
	 protected void show()
	 {
		 System.out.println("Hii");
	 }
 }

 class Q extends P
 {
	public void show()
	 {
		 System.out.println("Hello");
	 }
 }

public class A3 {

}
