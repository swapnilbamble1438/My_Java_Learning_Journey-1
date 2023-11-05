/*
---------------------------------------------------------------------------------------

public class Test {
	
	public static void main(String[] args) {
		
		String a= "hii";
		
		String b = new String("hii");
		
		StringBuffer c = new StringBuffer("hii");
		StringBuffer c2 = new StringBuffer("hii");
		
		StringBuilder d = new StringBuilder("hii");
		
		System.out.println("String a= "+a+";");
		System.out.println("String b= new String("+b+");");
		System.out.println("StringBuffer c= new StringBuffer("+c+");");
		System.out.println("StringBuffer c2= new StringBuffer("+c2+");");
		System.out.println("StringBuilder d= new StringBuilder("+d+");");
		
		System.out.println();
		
		System.out.println("a == b : " + (a == b));
		System.out.println("a.equals(b) : "+a.equals(b));
		
		System.out.println();
		
	//	System.out.println(a == c); // not possible
		System.out.println("a == c Not possible"); // not possible
		System.out.println("a == c.toString() : "+(a == c.toString()));
		System.out.println("a.equals(c) : "+a.equals(c));
		System.out.println("a.equals(c.toString()) : "+a.equals(c.toString()));
		
		System.out.println();
		
	//	System.out.println(b == c); not possible
		System.out.println("b == c Not possible"); // not possible
		System.out.println("b == c.toString() : "+ (b == c.toString()));
		System.out.println("b.equals(c) : "+b.equals(c));
		System.out.println("b.equals(c.toString()) : "+b.equals(c.toString()));
		
		System.out.println();
		
		System.out.println("c == c2 : "+(c == c2));
		System.out.println("c.equals(c2) : "+c.equals(c2));
		System.out.println("c.toString() == c2.toString() : "+ (c.toString() == c2.toString()));
		System.out.println("c.toString().equals(c2.toString()) : "+ (c.toString().equals(c2.toString())));
		
		System.out.println();
		
	//	System.out.println(c == d); not possible
		System.out.println("c == d Not possible"); // not possible
		System.out.println("c.toString() == d.toString() : "+ (c.toString() == d.toString()));
		System.out.println("c.equals(d) : "+ c.equals(d));
		System.out.println("c.toString().equals(d.toString()) : "+ (c.toString().equals(d.toString())));
		
		
		
	}

}	
		output: String a= hii;
			String b= new String(hii);
			StringBuffer c= new StringBuffer(hii);
			StringBuffer c2= new StringBuffer(hii);
			StringBuilder d= new StringBuilder(hii);
				
			a == b : false
			a.equals(b) : true
				
			a == c Not possible
			a == c.toString() : false
			a.equals(c) : false
			a.equals(c.toString()) : true
				
			b == c Not possible
			b == c.toString() : false
			b.equals(c) : false
			b.equals(c.toString()) : true
				
			c == c2 : false
			c.equals(c2) : false
			c.toString() == c2.toString() : false
			c.toString().equals(c2.toString()) : true
				
			c == d Not possible
			c.toString() == d.toString() : false
			c.equals(d) : false
			c.toString().equals(d.toString()) : true

-------------------------------------------------------------------------------------
*/
package Strings;

public class Aa15ii {
	
	public static void main(String[] args) {
		
		String a= "hii";
		
		String b = new String("hii");
		
		StringBuffer c = new StringBuffer("hii");
		StringBuffer c2 = new StringBuffer("hii");
		
		StringBuilder d = new StringBuilder("hii");
		
		System.out.println("String a= "+a+";");
		System.out.println("String b= new String("+b+");");
		System.out.println("StringBuffer c= new StringBuffer("+c+");");
		System.out.println("StringBuffer c2= new StringBuffer("+c2+");");
		System.out.println("StringBuilder d= new StringBuilder("+d+");");
		
		System.out.println();
		
		System.out.println("a == b : " + (a == b));
		System.out.println("a.equals(b) : "+a.equals(b));
		
		System.out.println();
		
	//	System.out.println(a == c); // not possible
		System.out.println("a == c Not possible"); // not possible
		System.out.println("a == c.toString() : "+(a == c.toString()));
		System.out.println("a.equals(c) : "+a.equals(c));
		System.out.println("a.equals(c.toString()) : "+a.equals(c.toString()));
		
		System.out.println();
		
	//	System.out.println(b == c); not possible
		System.out.println("b == c Not possible"); // not possible
		System.out.println("b == c.toString() : "+ (b == c.toString()));
		System.out.println("b.equals(c) : "+b.equals(c));
		System.out.println("b.equals(c.toString()) : "+b.equals(c.toString()));
		
		System.out.println();
		
		System.out.println("c == c2 : "+(c == c2));
		System.out.println("c.equals(c2) : "+c.equals(c2));
		System.out.println("c.toString() == c2.toString() : "+ (c.toString() == c2.toString()));
		System.out.println("c.toString().equals(c2.toString()) : "+ (c.toString().equals(c2.toString())));
		
		System.out.println();
		
	//	System.out.println(c == d); not possible
		System.out.println("c == d Not possible"); // not possible
		System.out.println("c.toString() == d.toString() : "+ (c.toString() == d.toString()));
		System.out.println("c.equals(d) : "+ c.equals(d));
		System.out.println("c.toString().equals(d.toString()) : "+ (c.toString().equals(d.toString())));
		
		
		
	}

}
