package Generic;


class four<Object> {
	
	private Object t;
	
	public void set(Object t) {
		this.t = t;
	}
	
	public Object get() {
		return this.t;
	}
	
	public void show() {
		System.out.println(t);
	}
	
}

public class three{
	public static void main(String args[]) {
		
		four<String> obj = new four();
		
		obj.set("Swapnil");
		obj.show();
		
		
		
		
	}
}
