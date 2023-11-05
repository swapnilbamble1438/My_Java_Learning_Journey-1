package oops.A2_constructor;

class OuterClassii{
	
	int x = 10;
	
	class InnerClass{
		
		public int myInnerMethod() {
			
			return x;
		}
	}
}


public class Ca13iii_Access_outer_from_inner_class {

	public static void main(String args[])
	{
		OuterClassii myOuter = new OuterClassii();
		
		OuterClassii.InnerClass myInner = myOuter.new InnerClass();
		
		System.out.println(myInner.myInnerMethod());
		
	}
}
