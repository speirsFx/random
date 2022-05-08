public class Merged {
    
    public static int[] merged_array(int[] alarge, int[] asmall)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[alarge.length + asmall.length];
        if(alarge.length != 0 && asmall.length != 0){
        while(asmall.length > i){

           
            if(alarge[j] >= asmall[i]){
                arr[k] = asmall[i];
                    i++;
                    k++;
                 
            } 
            else {
                arr[k] = alarge[j];
                j++;
                k++;
                if(j == alarge.length){
                    break;
                }
            }
        }

        if(j == alarge.length){
            for(int l = i; l < asmall.length; l++){
                arr[k] = asmall[l];
                k++;
            }
        }
        else { for(int l = j; l < alarge.length; l++ ){
            arr[k] = alarge[l];
            k++;
        } }}

        if(asmall.length == 0){
            arr = alarge;
        }
        if(alarge.length == 0){
            arr = asmall;
        }
        
        return arr;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){

    int[] conc = new int[nums1.length + nums2.length];
    if(nums1.length > nums2.length){
        conc = merged_array(nums1, nums2);
    }
    else {
        conc = merged_array(nums2, nums1);
    }
    double median = 0.0;

    if(conc.length % 2 == 0){
        median = (conc[(conc.length/2)-1] + conc[conc.length/2])/2.0;
      // System.out.println((conc[(conc.length/2)-1] + conc[conc.length/2])/2.0);
    }
    else {
        median = conc[((conc.length+1)/2)-1];
    }

    for(int i: conc){
        System.out.println(i);
    }

    
    return median;
    }
    

    public static void main(String[] args) {
        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{-2,-1};
        
        double s= findMedianSortedArrays(arr1,arr2);
        System.out.println(s);

    }
}
