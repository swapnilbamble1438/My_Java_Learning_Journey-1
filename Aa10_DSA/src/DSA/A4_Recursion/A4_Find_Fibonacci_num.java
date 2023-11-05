package DSA.A4_Recursion;

public class A4_Find_Fibonacci_num {
	
	
	public static void main(String[] args) {
		
		find(5,0,0,1,1);
	

	}
	
	static void find(int n,int f,int i,int j,int count)
	{
		
		
	
		if(count <= n)
		{
			
			f = i + j;
			
			System.out.print(i + " ");
			
			i = j;
			j = f;	
			
			count++;
			
			find(n,f,i,j,count);
				
		}
		
		
			
		
		
	}

}
