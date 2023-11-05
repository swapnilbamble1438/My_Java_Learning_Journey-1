package com;

public class Aa30ii_Array_multidim 
{

	public static void main(String[] args) 
	{
		//declare, init and assign values in 
		//multi dimensional array
		
		int [][]w;         // declare
		
		w = new int[5][3]; //init 
		//it has 5 rows and 3 columns
		// and it will be count like this
		// 5 rows will be count from (0 to 4)
		// 3 columns will be count from (0 to 2)
		
		int [][]x = new int [10][6]; //declare and init
		
		x[0][2] = 34; // assign
		
		System.out.println(x[0][2]); // retrive
		
/*------------------------------------------------------------*/
		int [][]y = new int [][] {
			{10,20,30},
			{11,22,23},     // that means it has 4 rows
			{21,44,12},     // and 3 columns
			{66,2,78}
		};                  // declare, init and assign
		System.out.println(y[2][1]);

	}

}
