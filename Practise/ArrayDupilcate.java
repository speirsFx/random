import java.util.ArrayList;



public class ArrayDupilcate {
   
    static ArrayList removeDuplicates(int []  nums){
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i :  nums){
            for(Integer j: arr){
                if( i == (int)j){
                    break;
                }
                arr.add(i);
            }
        }

        
        return arr;
    }

    public static void main(String[] args){

        ArrayList<Integer> t = new ArrayList<Integer>();
        int nums[] = new int[]{1,2,2};
    
        t = removeDuplicates(nums);
        for(Integer i: t){
            System.out.println(i);
        }

    }

}
