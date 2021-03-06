package Array;

import java.util.*;

public class FourSum {

    public static List<List<Integer> > fourSum(int[] nums, int target) {
        List<List<Integer> > s = new ArrayList<>();
        
        List<Integer> t = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        
        for(int i = 0 ; i< n-3; i++) {
        	
        	
        	for(int j = i + 1; j < n-2; j++) {
        		 {
	        		if(j == i+1 || nums[i] < nums[i+1] ) {
	        			int start = j+1;
	        			int end = n-1;
	        			int tg = target - nums[i] - nums[j];
	        			
	        			while(start < end) {
	        				if(start > j+1 && nums[start] == nums[start+1] ) {
	        					start++;
	        					continue;
	        				}
	        			
	        				if(end < n-1 && nums[end] == nums[end-1] ) {
	        					end--;
	        					continue;
	        				}
	        				
	        				if(tg == nums[start] + nums[end]){
	        					t.add(nums[i]);
	                            t.add(nums[j]);
	                            t.add(nums[start]);
	                            t.add(nums[end]);
	
	                            s.add(t);
	                            t=new ArrayList<>();
	                            start++;
	                            end--;
	                        }
	
	                        else if((nums[start] + nums[end]) > tg){
	                         
	                           end--;
	                        }else{
	                            start++;
	                        }
	        			}
	        		}
        		}
        	}
       }
        
        List<List<Integer> > li = new ArrayList<>();
        Boolean flag = false;
        
        for(List<Integer> k: s) {
        	for(List<Integer> j: li) {
        		if(j.equals(k)) {
        			flag = true;
        		}
        	}
        	if(flag == false) {
        		li.add(k);
        	}
        }
        
        
        return li;
    }

    public static void main(String[] args) {
        int a[] = new int[]{3,3,3,3,3,3};
  
       System.out.println("In Main");
 
        
     List<List<Integer> > t = new ArrayList<>();
     
     t = fourSum(a,12);
     
     for(List<Integer> k: t) {
     System.out.println(k);
    }}

}
