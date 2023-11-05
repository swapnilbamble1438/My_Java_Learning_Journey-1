package Java_Basic_Programs;

public class Aa12_Swap_Values_without_third_variable {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 13;
		
		a = a + b;
		b = a - b;
		a = a- b;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		
	}
}
