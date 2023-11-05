package Pattern_Programs;

public class Aa7 {

	
	public static void main(String[] args) {
		
		
		
		for(int row = 4; row > 0; row--)
		{
			for (int col = 1; col <= 4;col++)
			{
				if(col < row)
				System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		
		}
		
	}
	
}
