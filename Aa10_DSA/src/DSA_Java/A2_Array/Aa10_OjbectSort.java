package DSA_Java.A2_Array;



class Individual{
	
	private String lastName;
	private String firstName;
	private int age;
	
//----------------------------------------------------	

	public Individual(String lastName,String firstName, int age)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}
//----------------------------------------------------	
	
	public void displayIndividual()
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
////////////////////////////////////////////////////////////////

class ArrayInd
{
	private Individual[] arr;
	private int nElems;
	
//------------------------------------------------------------
	
	public ArrayInd(int max)
	{
		arr = new Individual[max];
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
		public void insert(Individual individual)       //put elements into Array
		{
			arr[nElems] = individual;          // insert it
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
				arr[j].displayIndividual();
			}
		}
//-------------------------------------------------------------------------
		public void insertionSort()
		{
			//
			for(int i = 0; i < nElems-1; i++)
			{
				
				for(int j= i+ 1; j > 0; j--)
				{
					if(arr[j].getLastName().compareTo(arr[j-1].getLastName())< 0)
					{
						swap(j,j-1);
					}
					else
					{
						break;
					}
				}
			}
		}
	//------------------------------------------------------	
		public void swap(int i,int j)
		{
			Individual tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
	//------------------------------------------------------	
		
		
		

	
	
}

////////////////////////////////////////////////////////////


public class Aa10_OjbectSort {
	
	public static void main(String[] args) {
		
		Individual individual1 = new Individual("Bamble","Swapnil",25);
		Individual individual2 = new Individual("More","Yash",24);
		Individual individual3 = new Individual("Shinde","Pratik",23);
		Individual individual4 = new Individual("Sawant","Deepak",22);
		Individual individual5 = new Individual("Malik","Zurez",21);
		
		ArrayInd arr;
		arr = new ArrayInd(100);     // create LowArray object
		
		arr.insert(individual1);
		arr.insert(individual2);
		arr.insert(individual3);
		arr.insert(individual4);
		arr.insert(individual5);
		
		arr.display();
		
		System.out.println("Array Size: "+arr.size());
		
		arr.delete("Sawant");
		
		arr.display();
		
		System.out.println("Array Size: "+arr.size());
		
		if(arr.find("More"))
			System.out.println("Present");
		else
			System.out.println("Not Present");
		
		System.out.println("After Sorting");
		arr.insertionSort();
		
		arr.display();
		
	}

}
