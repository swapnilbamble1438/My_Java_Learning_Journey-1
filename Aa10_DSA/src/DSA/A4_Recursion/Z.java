package DSA.A4_Recursion;

public class Z {

	public static void main(String[] args) {
		System.out.println(show(9));
	}
	
	static int show(int a)
	{
	if(a < 4)
	{
		return a;
	}
	
	return show(a-1);
	}
}
