package Pattern_Programs;

public class Aa2 {
	
	
	
	public static void main(String[] args) {
		
		
		
		for(int row=1; row < 5 ; row++)
		{
			
			for(int col = 1; col < 5; col++)
			{
				if(col == 1 || row == 1 || col == 4 || row == 4)
				 System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}
		
		
	}

}
