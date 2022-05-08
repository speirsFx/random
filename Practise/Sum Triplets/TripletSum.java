import java.util.*;

public class TripletSum {
    public static List<List<Integer> > threeSum(int[] nums) {

        int i;
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer> > s = new ArrayList<>();
        List<Integer> t= new ArrayList<>();

        for(i = 0; i<n-2; i++){
            if(i == 0 || nums[i] > nums[i-1]){
               int start = i+1;
               int end = n - 1;
               int target = 0 - nums[i];
            

            while(start < end){
                 if(start > i+ 1 && nums[start] == nums[start - 1]){
                    start++;
                  
                    continue;

                }

                if(end < n - 1 && nums[end] == nums[end + 1]){
                    end--;
                    
                    continue;
                } 

                if(target == nums[start] + nums[end]){
                    t.add(nums[i]);
                    t.add(nums[start]);
                    t.add(nums[end]);

                    s.add(t);
                    t=new ArrayList<>();
                    start++;
                    end--;
                  
                }

                else if((nums[start] + nums[end]) > target){
                 
                   end--;
                }else{
                    start++;
                }

            }
            }
        }
        
        return s;
    }

    public static void main(String[] args) {
        int a[] = new int[]{1,-1,-1,0};
  
       System.out.println("In Main");
        List<List<Integer> > s = threeSum(a);
        for(List k: s){
            System.out.println(k);
        }
    }
}
