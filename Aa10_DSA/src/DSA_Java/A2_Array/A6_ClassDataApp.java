package DSA_Java.A2_Array;


class Person{
	
	private String lastName;
	private String firstName;
	private int age;
	
//----------------------------------------------------	

	public Person(String lastName,String firstName, int age)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}
//----------------------------------------------------	
	
	public void displayPerson()
	{
		System.out.println(firstName +" "+ lastName+", Age: "+ age);
	}
//----------------------------------------------------	

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
//----------------------------------------------------	

}


class ClassDataArray
{
	private Person[] arr;
	private int nElems;
	
//------------------------------------------------------------
	
	public ClassDataArray(int max)
	{
		arr = new Person[max];
		nElems = 0;
	}
//------------------------------------------------------------
	
	public int size()
	{
		return nElems;
	}
	
//---------------------------------------------	
		public boolean find(String lastName)  // find specified value
		{
			for(int j = 0; j < nElems; j++)
			{
				if(arr[j].getLastName().equals(lastName))
				{
					return true;
				}
			}
			
			return false;
		
		}
//-------------------------------------------------
		public void insert(Person person)       //put elements into Array
		{
			arr[nElems] = person;          // insert it
			nElems++;             // increment size
		}

//------------------------------------------------------------	
		
		public boolean delete(String lastName)    // delete Element
		{
			int a = 0;
			for(int j = 0; j < nElems; j++)
			{
				if(arr[j].getLastName().equals(lastName))
				{	a = j;
					break;
				}
			}
			if(a > 0)
			{
				for(int k = a; k < nElems; k++)  // move higher ones
				{
					arr[k] = arr[k+1];
				}
				nElems--;                      // decrement size
				
				return true;
			
			}
			return false;

		}
		
//------------------------------------------------------------
		
		public void display()   // display elements
		{
			for(int j= 0; j < nElems;j++)   // display items
			{
				arr[j].displayPerson();
			}
		}
		
		
		

	
	
}



public class A6_ClassDataApp {
	
	public static void main(String[] args) {
		
		Person person1 = new Person("Bamble","Swapnil",25);
		Person person2 = new Person("More","Yash",24);
		Person person3 = new Person("Shinde","Pratik",23);
		Person person4 = new Person("Sawant","Deepak",22);
		
		ClassDataArray arr;
		arr = new ClassDataArray(100);     // create LowArray object
		
		arr.insert(person1);
		arr.insert(person2);
		arr.insert(person3);
		arr.insert(person4);
		
		arr.display();
		
		System.out.println("Array Size: "+arr.size());
		
		arr.delete("Sawant");
		
		arr.display();
		
		System.out.println("Array Size: "+arr.size());
		
		if(arr.find("More"))
			System.out.println("Present");
		else
			System.out.println("Not Present");
		
		
		
		
		
	}

}
