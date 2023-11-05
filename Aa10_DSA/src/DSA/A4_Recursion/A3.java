package DSA.A4_Recursion;

public class A3 {

	public static void main(String[] args) {
		
		show(1);
	}
	
	static void show(int n)
	{
		if(n == 6)
		{
			return;
		}
		System.out.println(n);
		show(n+1);
	}
}
