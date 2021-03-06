package Array;

import java.util.*;

public class CombinationSum {
    
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    	
    
    	List<List<Integer> > result = new ArrayList();
       
        sum(candidates, 0, target, new ArrayList(), result);
        return result;
        
    }
	
    
    public static void sum(int[] nums, int start, int target, List<Integer> list, List<List<Integer> > result) {
    	
    	if(target < 0) {
    		return;
    	}
    	
    	if(target == 0) {
    		result.add(new ArrayList(list));
    	}
    	
    	for(int i = start; i < nums.length; i++) {
    		list.add(nums[i]);
    		sum(nums, i+1, target - nums[i], list, result);
    		list.remove(list.size() - 1);
    	}
    	
    }
    
    
    public static void main(String[] args) {
    	
    	int nums[] = {2,3,4,6,7};
    	List<List<Integer> > li = new ArrayList();
		
    	li = combinationSum(nums, 7);
    	
    	for(List<Integer> k :  li)
    	{
    		System.out.println(k);
    	}
    	
	}
}
