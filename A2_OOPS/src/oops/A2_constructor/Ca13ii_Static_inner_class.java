package oops.A2_constructor;

class OuterClassi{
	
	int x = 10;
	
	static class InnerClass{
		
	int y = 5;	
		
	}
}

public class Ca13ii_Static_inner_class {

	public static void main(String args[]) {
		
		OuterClassi myOuter = new OuterClassi();
		
		OuterClassi.InnerClass myInner = new OuterClassi.InnerClass();
		
		System.out.println(myInner.y);
	}
}
