package Generic;

class two 
{
	
		private Object t;
		
		public void set(Object t) 
			{
			this.t = t;
			}
		public void show() 
			{
			System.out.println(t);
			}
}

public class one
{
	public static void main(String args[])
	{
		two t = new two();
		t.set(1);
		t.show();
		t.set("Swapnil");
		t.show();
	}
}