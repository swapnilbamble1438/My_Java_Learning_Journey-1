package DSA.A4_Recursion;

public class A2 {

	public static void main(String[] args) {
		
		 print(1);
		
	
	}


	static void print(int n)
	{
		
		if (n<=5)
				{
			System.out.println(n);
			n++;
			print(n);
				}
	}
	
	
}