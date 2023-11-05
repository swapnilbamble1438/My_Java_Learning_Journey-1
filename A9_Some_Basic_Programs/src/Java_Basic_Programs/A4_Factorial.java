package Java_Basic_Programs;
import java.lang.String;
import java.util.Scanner;
class A4_Factorial

{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);

	System.out.print("enter first number");
	int num = sc.nextInt();
	
	int f = 1 ;
	int i = 1;

	while(i <= num)
	{   
		f = f * i;
		i++;
		
    }
		System.out.println("ans" + f);

	}
}


/*

		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		int f = num;
		for(int i = num - 1; i >= 1; i--)
		{
			f= f* i;
			
		}
		System.out.println(f);
*/