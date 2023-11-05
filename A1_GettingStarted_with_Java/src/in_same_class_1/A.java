package in_same_class_1;

public class A
{
	private int pri;
	protected int pro;
	int def;
	public int pub;
	
	public void show()	
	{

		pri = 10;
		pro = 20;
		def = 30;
		pub = 40;
		
		System.out.println("private : " + pri);
		
		System.out.println("protected : " + pro);
		
		System.out.println("default : " + def);
		
		System.out.println("public : " + pub);
		
	}
}
