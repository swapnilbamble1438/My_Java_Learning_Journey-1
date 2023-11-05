package DSA.A1_Array.A7_Cyclic_Sort;

/* Note: It only works on continous elements

 
 */


import java.util.Arrays;

public class A1_Cycle_sort {
	
	 public static void main(String[] args) {
	        int[] arr = {5, 4, 3, 2,1};
	        sort(arr);
	        System.out.println(Arrays.toString(arr));
	    }


	     //Function to sort array using Cyclic sort
	   public static void sort(int[] arr) {
	        int i = 0;
	        while (i < arr.length) 
	        {
	            int correct = arr[i] - 1;
	            if (arr[i] != arr[correct]) 
	            {
	                swap(arr, i , correct);
	            } 
	            else 
	            {
	                i++;
	            }
	        }
	    }
	   //Function to swap two elements
	   public static void swap(int[] arr, int first, int second) {
	        int temp = arr[first];
	        arr[first] = arr[second];
	        arr[second] = temp;
	    }


}
