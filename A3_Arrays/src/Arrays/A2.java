// Java program to illustrate creating
//  an array of objects

package Arrays;

class Stud
{
	public String name;
	Stud(String name)
	{
		this.name = name;
		
	}
	@Override
	public String toString()
	{
		return name;
	}
}

public class A2 {
		
	public static void main(String args[])
	{
		Stud myStudents[] = new Stud[] {new Stud("Dharma"),new Stud("sanvi"),new Stud("Rupa"),new Stud("Ajay")}; 
		// Array of 5 students created but No students are there in the array
	
		// accessing the elements of the specified array
		for(Stud m:myStudents)
		{
			System.out.println(m);
		}		
	
	}

}
