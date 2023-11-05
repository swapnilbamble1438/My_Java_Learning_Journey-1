package Java_Basic_Programs;

public class A8ii_Compare_2obj 
{
	
	private int regno;
	private String name;

	public A8ii_Compare_2obj(int regno, String name) 
	{
		this.regno = regno;
		this.name = name;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	//
	public static void main(String args[])
	{
		A8ii_Compare_2obj emp1 = new A8ii_Compare_2obj(918,"Maria");
		
		A8ii_Compare_2obj emp2 = new A8ii_Compare_2obj(918,"Maria");
		
		int a = emp1.hashCode();
		int b = emp2.hashCode();
		
		System.out.println("hashcode of emp1 = " + a);
		
		System.out.println("hashcode of emp2 = " + b);
		
		System.out.println("hashcode of emp1 and emp2 = " + emp1.equals(emp2));
	
		
		
	
	
	}
	
}
