// single level inheritance

package oops.A3_inheritance;



class Calculator{
	
	public int add(int i, int j)
	{
		return i + j;
	}
}

class CalcAdvance extends Calculator{
	
	
	public int sub(int i, int j)
	{
		return i - j;
	}
	
}

public class B1_main {
	
	public static void main(String args[])
	{

	CalcAdvance ca1 = new CalcAdvance();
	int output1 = ca1.add(4, 4);
	int output2 = ca1.sub(7, 4);
	
	System.out.println(output1);
	System.out.println(output2);
	
	}
}
