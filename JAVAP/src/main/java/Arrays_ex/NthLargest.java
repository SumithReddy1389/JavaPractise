package Arrays_ex;

import java.util.Arrays;

public class NthLargest {
    public static void find(int[] a, int n){
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a[a.length - n]);
    }

    // The difference between the largest and smallest values in an array of integers
    public static void diff(int[] a){
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a[0]+","+a[a.length-1]);
        int d = a[0] - a[a.length-1] ;
        System.out.println("Difference: "+ d);
    }
    public static void main(String[] args) {
        int [] arr = {9,1,3,6,98,2,76,8,3,19};
        int n = 6;
//        find(arr, n);

        diff(arr);
    }
}
