package GetSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Consumer;

public class A2_example 
{	
	private int number;
	public ArrayList Languages;
	private String name;
	private Date date;
	private boolean flag;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public ArrayList getLanguages() {
		return Languages;
	}
	public void setLanguages(ArrayList languages) {
		Languages = languages;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public static void main(String[] args)
	{
		
		
		A2_example ex = new A2_example();
		
		//==================================================================//
		ex.setNumber(10);
		int output = ex.getNumber();
		System.out.println("Value of Integer Number is: " + output);
		//=======================================================================//

		System.out.println(); // for one line space
		
		//====================================================================//
		ArrayList list = new ArrayList();
		list.add("Java");
		list.add("Python");
		list.add("C");
		list.add("C++");
		list.add("Machine Learning");
		
		ex.setLanguages(list);
		ArrayList languages = ex.getLanguages();
		System.out.println("List of languages is: "+ languages);
		//========================================================================//
		
		System.out.println();
		
		//=======================================================================//		
		ex.setName("Swapnil");
		String Name = ex.getName();
		System.out.println("Name is: " + Name);
		//======================================================================//
				
		System.out.println();
		
		//======================================================================//
		Date date = new Date();
		ex.setDate(date);
		Date outdate = ex.getDate();
		System.out.println("Current Date is: " + outdate);
		//=======================================================================//
		
		System.out.println();
		
		//========================================================================//
		ex.setFlag(true);
		boolean outflag = ex.isFlag();
		System.out.println("Flag is: " + outflag);
		//=======================================================================//
	}
}
