package Arrays_ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SumOfPairs {
    public static HashSet<Integer> findSum(int[] a, int sum){
        HashSet<Integer> an = new HashSet<>();
        for(int i =0; i < a.length; i++){
            for(int j =i+1; j < a.length; j++) {
                if(a[i] + a[j] == sum){
                    an.add(a[i]);
                    an.add(a[j]);
                }
            }
            }
        return  an;
    }

    public static void equalityOfArrays(int [] a1, int [] a2){
        boolean f = true;
        if(a1.length == a2.length){
        for(int i =0; i < a1.length; i++){
                if(a1[i] == a2[i]){
                    f = true;
                }
            }
        }
        else {
            f = false;
        }
        System.out.println(f);

    }


        public static void main(String[] args) {
        int [] arr = {9,1,3,6,98,2,76,8,3,19};
            int [] arr1 = {9,1,3,6,98,2,76,8,3};

            int s = 9;
//        System.out.println(findSum(arr, s));
            equalityOfArrays(arr, arr1);
    }
}
