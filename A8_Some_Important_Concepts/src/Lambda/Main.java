package Lambda;

// Note: lambda only works when
// the class we want to access should be Functional Interface class
// watch details of Functional interface class in
// MyInter interface which we have created

public class Main {
	
	public static void main(String[] args) {
		
		// Using Interface(MyInter) with InterfaceImplementation(MyInterImpl) class
		//using object
/*
		MyInter myInter = new MyInterImpl();
		myInter.sayHello();
*/		
		
		
// without using MyInterImpl we can also use MyInter by this way
// using anonymous class		
/*
 		MyInter i = new MyInter() {
 
			
			@Override
			public void sayHello() {
				System.out.println("This is first anonymous class");
				
			}
		};
		
		i.sayHello();
		
		
		MyInter i2 = new MyInter() {
			
			@Override
			public void sayHello() {

				System.out.println("This is second anonymous class");

			}
		};
		i2.sayHello();
		
		
*/
		
//	Using MyInter with Lambda expression	
	
		MyInter my1=()->{
		System.out.println("This is first time I am using lambda");
		};
		
		my1.sayHello();
		
		//=========================
		
		MyInter2 my2 =(int a, int b) -> {
			return a+b;
			};
		
			System.out.println(my2.sum(2, 5));
		
		//===============================
			
			MyInter2 my2ii = (a, b) -> 
				a + b;
			;
			System.out.println(my2ii.sum(2, 1));
	
		//========================================
			
			MyInter3 my3 = str -> str.length();
			
			System.out.println(my3.getLength("Swapnil"));
			
		
	}
	
		
}