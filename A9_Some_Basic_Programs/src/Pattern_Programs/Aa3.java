package Pattern_Programs;

public class Aa3 {
	
	
	public static void main(String[] args) {
		
		

		for(int row=1; row < 6 ; row++)
		{
			
			for(int col = 1; col < 6 ; col++)
			{
//						if((col == 1 && row == 1) || 
//						   (col == 2 && row == 2 ) ||
//						   (col == 3 && row == 3 ) ||
//						   (col == 4 && row == 2) ||
//						   (col == 5 && row == 1)  ||
//						   (col == 2 && row == 4)  ||
//						   (col == 4 && row == 4)  ||
//						   (col == 1 && row == 5) ||
//						   (col == 5 && row == 5)
//						   
//						   
//								)
//						 System.out.print("* ");

				if(col == row || col + row == 6)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
