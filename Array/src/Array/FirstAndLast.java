package Array;

public class FirstAndLast {
	
	
	public static int LastSearch(int[] nums, int target) {
		
		int ans = -1;
		
		int l = 0;
		int h = nums.length - 1;
		int m = (l +h)/2;
		
		while(l <= h) {
			
			m = (l+h)/2;
			
			
			
			 if(nums[m] >  target) {
				 h = m-1;
						
			}
			
			else if(nums[m] < target) {
				l = m+1;
				
			}
		    else
		    {
		      ans = m;
		      l = m + 1;
		    }
		  }
		return ans;
		
		}
	
	
	public static int FirstSearch(int[] nums, int target) {
		
		int ans = -1;
		
		int l = 0;
		int h = nums.length - 1;
		int m = (l +h)/2;
		
		while(l <= h) {
			
			m = (l+h)/2;
			
			
			
			 if(nums[m] >  target) {
				 h = m-1;
						
			}
			
			else if(nums[m] < target) {
				l = m+1;
				
			}
		    else
		    {
		      ans = m;
		      h = m - 1;
		    }
		  }
		return ans;
		
		}
		
		
	

    public int[] searchRange(int[] nums, int target) {
    	
    	
    	
    	int f = FirstSearch(nums, target);
    	int l = LastSearch(nums, target);
    	int[] a =new int[2];
    	
    	a[0] = f;
    	a[1] = l;
    	
    	
    		
    		
    	
       return a;
    	
    	
    }
    
    
    public static void main(String[] args) {
		int a[] = {1,2,2,3,3,3,4,4,4,4,4,4,6};
		int ans = FirstSearch(a, 4);
		
	
		System.out.println(ans);
		
		System.out.println(LastSearch(a,4));
	}
	
}
