/*

Sorting is the process of arranging the data
in some logical order.
In case of numeric values, logical order may
be in ascending or descending order.
In case of alphanumeric values, it can be 
in dictionary order.

Bubble sort:
Bubble sort, also referred to as sinking sort,
is a comparison based algorithm i.e. 
comparing each pair of adjacent items and
swapping them if they are in the wrong order,
The pass through the list is repeated until
no swaps are needed, which indicates that
the list is sorted.

e.g:

	36   19    29    12    5
	                         _____
	36   19	   29    12    5      |  Round 1
	|_____|                       |  In which
                                  |  the largest
    19   36    29    12    5      |  element 
	      |_____|                 |  will move
	                              |  to last
    19   29    36    12    5      |  position
                |_____|	          |
                                  |
    19   29    12    36    5      |
                      |____|      |
                                  |
    19   29    12    5     36 ____|     
    
                     
                              ____
    19   29     12    5    36     |  Round 2
     |____|                       |  
                                  |  In which 
    19   29     12    5    36     |  the 2nd
          |______|                |  largest
                                  |  element
    19   12     29     5   36     |  will move
                 |_____|          |  to the 
                                  |  2nd last 
    19   12      5     29   36    |   position
                        |____|    |
                                  |
    19   12      5     29   36 ___|               
                     
                    
                               ___
    19    12     5     29   36    |  Round 3
     |_____|                      | 
                                  | In which
    12    19     5     29   36    | the 3rd largest
           |_____|                | elements will
                                  | move to 3rd
    12     5     19    29   36 ___| last position          
                     
                               ___ 
    12     5     19    29   36    |  Round 4        
     |_____|                      |   At final
                                  |  we will
     5     12    19    29   36 ___|  get sorted list
                          
     
     So the number of rounds will always 
     be the Total number of elements - 1
     
     here elements are 5-1 = 4 Rounds
     Therefore we got four number of rounds
     and at last round we will get 
     sorted list                     
                          
---------------------------------------------------------

e.g:




*/
package DSA_Sorting_n_Searching_Algorithm;

import java.util.Arrays;

public class A1i_Bubble_Sort {
	
	public static void main(String[] args) {
		
		int[] a = {36, 19 ,29 ,12,5};
		
		for(int i = 0; i < a.length-1; i++)
		{	
			for(int j = 0; j < a.length-1 ; j++)
			{
	
				int temp = 0;
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] =  a[j+1];
					a[j+1] = temp;
			
				}
				
			}
		}
		
		System.out.println(Arrays.toString(a));
		
		
	}
	
	

}
