package TargetSum;

import java.util.Arrays;

public class TargetSum {
    public static int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        int sum = 0;
        int ans = 0;

        for(int i = 0; i < n-2; i++){
            int start = i+1;
            int end = n-1;

            while(start < end){
                 sum=nums[i]+nums[start]+nums[end];

                int new_diff = Math.abs(sum-target);
                if(diff > new_diff){
                    diff = new_diff;
                   ans= sum;

                }
                
                if(sum > target) {
                	end--;
                }
                else {
                	start++;
                }

                

            }

            
        }
        return ans;
        
    }


    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(threeSumClosest(a, 7));
    }
}
