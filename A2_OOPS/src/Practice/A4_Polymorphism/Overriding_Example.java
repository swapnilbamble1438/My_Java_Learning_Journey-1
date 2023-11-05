package Practice.A4_Polymorphism;


class College{
		
	void study()
	{
		System.out.println("Studying in College");	
	}
}

class Std extends College
{
	
	 void study()
	{
		 super.study();
		System.out.println("Studying in Std 15");
	}
}

public class Overriding_Example extends College {
	
	public static void main(String[] args) {
		
		Std s1 = new Std();
		s1.study();
		
		
		
		
		
		
		
	}

}
