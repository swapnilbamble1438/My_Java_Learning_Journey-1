package oops.A3_inheritance;
// calling constructor from parent 
// and from child also


class G
{

	
	int b = 2;
	
}

class H extends G
{
	int b = super.b;
	public H(int b)
	{
		super.b = b;
		
	}
	
	public void show()
	{
		System.out.println("b : " + b);
	}
}
public class B5 {

	public static void main(String[] args) {
		
		H h1 = new H(4);
		h1.show();
	}
}
