// single level inheritance

package oops.A3_inheritance;



// class Calculator (from main class)

// class CalcAdvance extends Calculator (from main class)a

class CalcveryAdv extends CalcAdvance  
{
	public int multi(int i, int j)
	{
		return i* j;
	}
	
}

public class B1_test {
	
	public static void main(String args[])
	{

	CalcveryAdv cva = new CalcveryAdv();
	int output1 = cva.add(4, 4);
	int output2 = cva.sub(7, 4);
	int output3 = cva.multi(7, 4);
	
	System.out.println(output1);
	System.out.println(output2);
	System.out.println(output3);
	
	}
}
