package Practice.A3_Inheritance;

public class Sample {
	
	public static void main(String args[])
	{
		
		Calculator c1 = new Calculator();
		int result = c1.add(1, 4);
		
		AdvCalculator c2 = new AdvCalculator();
		int result1 = c2.add(5, 2);
		int result2 = c2.sub(5, 2);
		
		
		System.out.println(result1);
		
	}
	

}

class Calculator{
	
	
	public int add(int i, int j)
	{
		return i+j;
	}
}

class AdvCalculator extends Calculator{ 
	
	
	public int sub(int i, int j)
	{
		return i-j;
	}
	
}