package Java_Basic_Programs;

public class A8i_Compare_2obj {

	public static void main(String args[])
	{
		Double x = new Double(123.45555);
		
		Long y = new Long(9887544);
		
		System.out.println("Objects are not equal,hence it returns " + x.equals(y));
		
		System.out.println("Objects are equal,hence it returns " + x.equals(123.45555));
		
		Double a = 5.5;
		Double b = 5.6;
		
		System.out.println(a.equals(5.5));
		
		
	}
}
