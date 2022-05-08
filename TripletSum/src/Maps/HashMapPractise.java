package Maps;

import java.util.*;

public class HashMapPractise {

	
	
	public static List<List<Integer> > fourSum(int[] nums, int target) {
		
		HashMap<Integer, List<List<Integer> > > mp = new HashMap<>();
		
		HashSet<ArrayList<Integer> > ans
		= new HashSet<ArrayList<Integer> >();
		
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i+1; j < nums.length; j++) {
				int sum = nums[i] + nums[j];
				
				if(!mp.containsKey(sum))
				{
					ArrayList<Integer> temp = new ArrayList<>();
					List<List<Integer> > li = new ArrayList<>();
					temp.add(i);
					temp.add(j);
					li.add(temp);
					mp.put(sum,li);
					
					
				}
				else {
					List<List<Integer> > temp = mp.get(sum);
					ArrayList<Integer> p = new ArrayList<>();
					p.add(i);
					p.add(j);
					
					temp.add(p);
					
					mp.put(sum,temp);
					
					
				}
				
			}}
			
			
			
			for(int i = 0; i < nums.length - 1; i++) {
				for(int j = i+1; j < nums.length; j++) {
					
					int lookup = target - (nums[i] + nums[j]);
					
					if(mp.containsKey(lookup)) {
						List<List<Integer> > temp = mp.get(lookup);
						
						for(List<Integer> l: temp) {
							if(i != l.get(0)
								&& j != l.get(0)
							    && i != l.get(1)
							    && j != l.get(1)) {
								
								ArrayList<Integer> temp1 = new ArrayList<>();
								
								temp1.add(nums[l.get(0)]);
								temp1.add(nums[l.get(1)]);
								temp1.add(nums[i]);
								temp1.add(nums[j]);
								
								Collections.sort(temp1);
								
								ans.add(temp1);
							}
						}
						
					}
				}
			}
			
			List<List<Integer> > sol = new ArrayList<>();
			for (ArrayList<Integer> arr : ans) {
				sol.add(arr);
			}
			return sol;
		}
	
	
		
		
		
	public static void map1() {
		HashMap<Integer, List<List<Integer> > > mp = new HashMap<>();
		
		List<List<Integer> > li = new ArrayList<>();
		
		ArrayList<Integer> s = new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			for(int j = 1; j< 6; j++) {
				s.add(i);
				s.add(j);
				li.add(s);
				mp.put(i, li);
				s = new ArrayList<>();
			}
		}
	}
		

	
	public static void main(String[] args) {
		List<List<Integer> > sol = new ArrayList<>();
		
		int nums[] = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,60,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,80,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90};
		
		sol = fourSum(nums,200);
		
		for(List<Integer> k :  sol) {
			System.out.println(k);
		}
	}
}


