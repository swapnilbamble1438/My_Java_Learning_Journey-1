package oops.A2_constructor;

class OuterClass{
	
	int x = 10;
	
	class InnerClass{
		
		int y = 5;
	}
}


public class Ca13i_Inner_class {
	
	public static void main(String args[])
	{
		OuterClass myOuter = new OuterClass();
		
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		
		System.out.println(myOuter.x + myInner.y);
	}
}
/*
	Private Inner Class
Unlike a "regular" class, an inner class can be private or protected. 
If you don't want outside objects to access the inner class, 
declare the class as private.

If you try to access a private inner class from an outside class, 
an error occurs:
*/