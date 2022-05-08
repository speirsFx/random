package Array;

public class ValRemove {

	  public static int removeElement(int[] nums, int val) {
		   
	int count = 0;
	
	for(int i = 0; i < nums.length; i++) {
		if(i != nums.length-1 && nums[i]==val) {
			shiftArray(nums,i);
			i=i-1;
			count++;
		}
			
	}
	        return count;
	    }
	
	public static void shiftArray(int[] nums, int k) {
		
		for(int i = k;i < nums.length-1; i++) {
			nums[i] = nums[i+1];
		}
	}
	
	public static void main(String[] args) {
		int nums[] = {3,2,2,3};
		
		int ct = removeElement(nums, 2);
		
		System.out.println(ct);
		
		for(int i =0; i < ct; i++) {
			System.out.println(nums[i]);
		}
		
	}
	
	
}
