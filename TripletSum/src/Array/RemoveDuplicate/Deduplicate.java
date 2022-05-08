package Array.RemoveDuplicate;

public class Deduplicate {
	   public static int removeDuplicates(int[] nums) {
	        // Length of the updated array
	        int count = 0;
	        // Loop for all the elements in the array
	        for (int i = 0; i < nums.length; i++) {
	            // If the current element is equal to the next element, we skip
	            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
	                continue;
	            }
	            // We will update the array in place
	            nums[count] = nums[i];
	            count++;
	        }
	        return count;}
	   
	   
	   public static int removeElement(int[] nums, int val) {
		   
		   int count = 0;
	        for(int i = 0; i < nums.length; i++) {
	        	if(nums[i] == val) {
	        		count ++;
	        		
	        	}
	        }
	        
	        return count;
	    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int[] a = {1,2,2,2,3,4,5};
     // System.out.println(removeDuplicates(a));
      System.out.println(removeElement(a, 2));
    
    }
}
