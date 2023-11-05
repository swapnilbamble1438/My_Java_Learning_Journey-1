package Java_Basic_Programs;

public class A6_Random_num {

	public static void main(String args[])
	{
		//
		System.out.println("Random Number : " + Math.random());
		
		//
		int min = 200;
		int max = 400;
		
		System.out.println("Random value of type double between " + min + " to " + max + ";");
		double a = Math.random() * (max-min +1) + min;
		
		System.out.println(a);
		
		System.out.println("Random value of type int between " + min + " to " + max + ";");
		int b = (int)(Math.random() * (max-min +1) + min);
		
		System.out.println(b);
		
		double c = Math.random() * 201 + 200;
		System.out.println(c);
	}
	
}
