import java.util.*;

class CombinationSum2 {
    
    
    
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
    		List<List<Integer> > result = new ArrayList();
		List<Integer> list = new ArrayList();
        
        Arrays.sort(candidates);
		
		backtracking(candidates, target, 0, list, result);
    
        return result;
   
    }
	

	
	public static void backtracking(int[] nums, int target, int start, List<Integer> list,List<List<Integer>> result ) {
		
		if(target == 0) {
			result.add(new ArrayList(list));
			return;
		}
		
		
		
		for(int i = start; i < nums.length; i++) {
			if(i > start && nums[i] == nums[i-1])
				continue;
			if(nums[i] > target)
				break;
			
			list.add(nums[i]);
			backtracking(nums, target - nums[i], i+1, list, result);
			list.remove(list.size()-1);
			
		}
		
	}
    	
}