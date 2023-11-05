package Sub_class_in_same_package_2;

public class C 
{
	private int pri;
	protected int pro;
	int def;
	public int pub;

	public void show()	
	{
		pri = 50;
		pro = 60;
		def = 70;
		pub = 80;
		
		System.out.println("private : " + pri);
		
		System.out.println("protected : " + pro);
		
		System.out.println("default : " + def);
		
		System.out.println("public : " + pub);
		
	}
}
class D extends C
{
	
	
}
