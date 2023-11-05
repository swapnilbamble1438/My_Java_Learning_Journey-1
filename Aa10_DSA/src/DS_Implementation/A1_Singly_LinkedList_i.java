package DS_Implementation;

class School
{
	private Student start;
	
	static class Student
	{
		String name;
		String surname;
		
	}
	
	public void insert(String name,String surname)
	{
		Student st = new Student();
		st.name = name;
		st.surname = surname;
		
		start = st;
	}
	
	public void show()
	{
		System.out.println(start.name + " " + start.surname);
	}
	
}


public class A1_Singly_LinkedList_i {
	public static void main(String[] args) {
		
		School s = new School();
		s.insert("Swapnil", "Bamble");
		s.show();
		
	}
	
	

}
