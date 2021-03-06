package Array;

public class RotatedArray {

    public static int search(int[] nums, int target) {
    	
    	int l = nums.length-1;
    	int k = 0;
    	int lowest = 0;
    	int lowest_num =Integer.MAX_VALUE;
    	
    	while(l >= k) {
    		if(nums[l] >= nums[k] && lowest_num >= nums[k]) {
    			lowest = k;
    			lowest_num = nums[k];
    		}
    		else if(lowest_num > nums[l]) {
    			lowest = l;
    			lowest_num = nums[l];
    		}
    		l--;
    		k++;
    		
    		
    	}
    	
    	if(target >= nums[lowest] && target<nums[nums.length-1] ) {
    		
    		
    	      l = lowest;
    	      int r = nums.length - 1;
    	        while (l <= r) {
    	            int m = l + (r - l) / 2;
    	 
    	            // Check if x is present at mid
    	            if (nums[m] == target)
    	                return m;
    	 
    	            // If x greater, ignore left half
    	            if (nums[m] < target)
    	                l = m + 1;
    	 
    	            // If x is smaller, ignore right half
    	            else
    	                r = m - 1;
    	        }}
    		
    	
    	else {
    		
    	       l = 0;
    	       int r = lowest-1;
    	        while (l <= r) {
    	            int m = l + (r - l) / 2;
    	 
    	            // Check if x is present at mid
    	            if (nums[m] == target)
    	                return m;
    	 
    	            // If x greater, ignore left half
    	            if (nums[m] < target)
    	                l = m + 1;
    	 
    	            // If x is smaller, ignore right half
    	            else
    	                r = m - 1;
    	        }
    	}
    	
    	
        
    	
    	return lowest;
    }
    
    
    public static void main(String[] args) {
		int a[] = {5,1,3};
		
		System.out.println(search(a,2));
	}
	
}
