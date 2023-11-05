package Java_Basic_Programs;

public class Aa14_Call_by_value {
	
	public static void main(String[] args) {
		
		Operation op= new Operation();
		
		System.out.println("before change " + op.data);
		
		op.change(50);
		
		System.out.println("after change " + op.data);
		
	}
}

class Operation{
	
	int data=50;
	
	void change(int data)
	{
		data = data + 100;
	}
	
}
