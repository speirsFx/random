public class Merged {
    
    public static int[] merged_array(int[] alarge, int[] asmall)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[8];
        System.out.println(alarge.length + asmall.length);
        System.out.println(alarge.length);
        System.out.println(asmall.length);
        System.out.println("----------------------");
        while(asmall.length > i){
            if(alarge[j] > asmall[i]){
                arr[k] = asmall[i];
                    i++;
                    k++;
            } 
            else {
                arr[k] = alarge[j];
                j++;
                k++;
            }
        }

        for(int l = asmall.length; l < alarge.length; l++ ){
            arr[k] = alarge[l];
            k++;
        }
        
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,11,21};
        int[] arr2 = new int[]{2,4};
        int[] arr3 = new int[8];
        arr3 = merged_array(arr1, arr2);

        for(int i: arr3){
            System.out.println(i);
        }

    }
}
