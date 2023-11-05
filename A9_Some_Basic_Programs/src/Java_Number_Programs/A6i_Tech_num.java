/*
 Tech Number Example:
   2025 
  20   25
  20 + 25
    45²  
    2025
  Therefore it is a tech number.  
 
 */
package Java_Number_Programs;

public class A6i_Tech_num {

	public static void main(String args[])
	{
		int i;
		int j = 9999;
		
		for(i = 1000; i<= j; i++)
		{
			int firsthalf = i / 100;
			int secondhalf = i % 100;
			int sum = firsthalf + secondhalf;
			
			if(i == sum * sum)
				System.out.println(i);		}
	}
}
