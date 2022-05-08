package Array;

public class SearchInsert {
	
    public static int searchInsert(int[] nums, int target) {
        
		int ans = -1;
		
		int l = 0;
		int h = nums.length - 1;
		int m = (l +h)/2;  	
  
		while(l <= h) {
			
			m = (l+h)/2;
			
			if(nums[m] == target) {
				ans = m;
				break;
			}
			
			 if(nums[m] >  target) {
				 h = m-1;
						
			}
			
			else if(nums[m] < target) {
				l = m+1;
				
			}
    	
    }
		
		if(ans == -1) {
			
			if(nums[0] < target && nums[nums.length] > target)
			ans = (l+h)/2 + 1;
			
			else if(nums[0] > target) {ans = 0;}
			
			else if(nums[nums.length] < target ) {
				ans = nums.length + 1;
			}
		}
		
	
		return ans;
	
    }
    
    
    public static void main(String[] args) {
		int a[]= {1,2,4,5};
		
		System.out.println(searchInsert(a,3));
	}
    
}
