package Pattern_Programs;

//(row==1) && (col== 1) ||
//(row==2) && (col==1 || col == 3) ||
//(row==3) && (col==1 || col==3 || col==5) ||
//(row==4) && (col==1 || col==3 || col==5 || col==7) ||
//(row==5) && (col==1 || col==3 || col==5) ||
//(row==6) && (col==1 || col == 3) ||
//(row==7) && (col==1)


public class Aa6 {
	
	
	
	
	public static void main(String[] args) {
		
		
		for(int row = 1; row < 5; row ++)
		{
			for( int col = 1; col <= row ; col++)
			{
				System.out.print("* ");
			
			}
			System.out.println();
						
											
		}
		for(int row = 1; row < 4; row ++)
		{
			for( int col = 3; col >= row ; col--)
			{
				System.out.print("* ");
			
			}
			System.out.println();
						
											
		}
			
		}
		
	

}
