package Array;

import java.util.Arrays;
import java.util.Collections;

public class Lexographical {
	
	public static void swap(int[] arr, int i, int j) {
	    arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
	}
	
	 static int[] reverse(int nums[], int k)
	    {
	        int[] b = new int[nums.length-k-1];
	        int j = 0;
	        for(int i = nums.length-1; i > k; i--) {
	            b[j] = nums[i];
	            j = j +1 ;
	           
	        }
	        
	        j = 0;
	        
	    //    for(int i : b) {
	    //    	System.out.println(i);
	    //    }
	        
	   for(int i = k+1; i < nums.length; i++) {
	   	nums[i] = b[j];
	   	j++;
	   	
	   }
	 
	        return b;
	      }

	public static void Order(int[] nums) {
		
		int largest1 = -1;
		
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i] < nums[i+1]) {
				largest1 = i;
			}
		}
		
		if(largest1 == -1) {
			Arrays.sort(nums);
			
		}
		
		int largest2 = -1;
		for(int i =0; i <  nums.length; i++) {
			if(nums[largest1] < nums[i]) {
				largest2 = i;
			}
		}
		
		swap(nums, largest1, largest2);
		
		reverse(nums,largest1);
		
	
		
		
	}
	
	
	public static void main(String[] args) {
		int[] a = {1,2,3,1,4,5};
		
		reverse(a,2);
		
		
		 for(int i : a) {
			 System.out.println(i);
		 }
		 
	// swap(a, 3,5);
	// for(int k: a) {
	//	 System.out.println(k);
	// }
	//
	}
}
