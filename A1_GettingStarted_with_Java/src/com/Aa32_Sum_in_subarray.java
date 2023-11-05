package com;
import java.util.Scanner ;  
class Aa32_Sum_in_subarray
{
	 public static void main(String[] args)  
	 {  
	     
	 Scanner sc = new Scanner(System.in);   
	 
	 System.out.println(" Enter number of elements :  ");  
	int n = sc.nextInt() ;  
	
	 int []x = new int[n] ;  
	 
	 System.out.println (" Enter elements of the array :  ");  
	 for (int i = 0 ; i < n ; i++)  
	 {  
	     x[i] = sc.nextInt();  
	 }  
	 
	 System.out.println(" Enter value of sum : ");  
	 int sum = sc.nextInt();  
	
	  int sum2, i , j ,k;  

      for (i = 0 ; i < n ; i++) 
      {  
          sum2 = x[i];  
         
          for (j = i + 1 ; j <= n ; j++) 
          {  
              if (sum2 == sum) 
              {  
                   k = j - 1 ;  
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
                  System.out.println(" from  " + i + " to " + k);  
                  
              }  
              if (sum2 > sum || j == n)  
                  break ;  
              
              
              sum2 = sum2 + x[j] ;  

          	   
              
          }
      }
    
            System.out.println(" sum not found in any subarray " ) ; 
   
	}  
} 