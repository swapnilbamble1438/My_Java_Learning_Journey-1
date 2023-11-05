package Java_Basic_Programs;
import java.util.Scanner;
public class A7ii_Print_Pattern {
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		int i, j, num =1 ;
		 
		for(i=1; i < 5; i ++)
		{
			
			for(j = 1; j<= i; j++)
			{
				System.out.print(num + " ");
				
				num = num + 1;
			}
			System.out.println();
		}
		
		
	}
}



 