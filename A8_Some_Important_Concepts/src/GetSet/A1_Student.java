package GetSet;

public class A1_Student 
{
	
	String Name;
	int RollNumber;
	

	
	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public int getRollNumber() {
		return RollNumber;
	}



	public void setRollNumber(int rollNumber) {
		
		if(rollNumber <= 0)
		{
			throw new IllegalArgumentException("Invalid Args");
		}
		RollNumber = rollNumber;
	}



	public void display()
	{
		System.out.println(Name);
		System.out.println(RollNumber);
	}


}
