package oops.A6_encapsulation;

public class Practice {
	
	public static void main(String[] args) {
		
		Friends obj = new Friends();
		obj.setName("Rakesh");
		obj.setSurname("Jadhav");
		
		System.out.println(obj.getName() + " " + obj.getSurname());
		
	}

}

	class Friends
	{
		private String Name;
		private String Surname;
	
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getSurname() {
			return Surname;
		}
		public void setSurname(String surname) {
			Surname = surname;
		}
		
		
		
	}