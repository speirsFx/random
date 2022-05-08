class ArraySum {
    public int[] twoSum(int[] nums, int target) {
        
        int sum = 0;
        int k = 1,l=1;
        for(int i = 0; i <= nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                sum = nums[i] + nums[j];
                    if(sum == target){
                        k = i;
                        l = j;
                        break;
                    }
            }
            sum = 0;
        }
        
        int arr[] = {k,l};
        return arr;
    }


    public static void main(String args[]){
        int[] arr1 = new int[]{1,2,3};
        

        ArraySum t2 = new ArraySum();
        for(int i = 0; i < arr1.length; i++)
        System.out.println(arr1[i]);
      
        int y[] = new int[2];
        
        y = t2.twoSum(arr1,9);
        for(int j = 0; j < y.length; j++){
            System.out.println(y[j]);
        }

    }
}