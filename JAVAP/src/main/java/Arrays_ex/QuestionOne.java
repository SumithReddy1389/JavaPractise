package Arrays_ex;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import static java.util.Arrays.*;

public class QuestionOne {
    public static void main(String[] args) {

      /*  // Sortin an Array
        int [] a = {2,7,4,2,9,1,0};
        System.out.println("Before sorting: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting: " + Arrays.toString(a));

        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        System.out.println("Before sorting: " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("After sorting: " + Arrays.toString(my_array2));*/

/*
//        sum values of an array
        int a1[] = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i : a1){
            sum += i;
        }
        System.out.println("Sum of values in arrray: " +sum);*/


        /*int[][] twoD =  new int[10][10];

        for(int i = 0; i < twoD.length;i++){
            for(int j = 0; j < twoD[i].length; j++){
                System.out.print("-");
                System.out.print(" ");
            }
            System.out.println("");
        }*/


/*//       to calculate the average value of array elements.
        int a1[] = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i : a1){
            sum += i;
        }
        int av = sum / a1.length;
        System.out.println("Average of values in arrray: " +av);*/

/*
        public static boolean contains(int[] arr, int item) {
            for (int n : arr) {
                if (item == n) {
                    return true;
                }
            }
            return false;
        }
*//*

//        largest in an array

        int [] a1 ={22,55,32,41,34,2,3,567,21};
        Arrays.sort(a1);
        System.out.println(a1[a1.length -1]);
        System.out.println(a1[0]);

        int l = a1[0];
        for(int i : a1){
            if(l < i){
                l = i;
            }
        }
        System.out.println(l);*/

     /*   //Duplicates in a array;
        int [] a1 ={22,55,32,41,34,2,3,567,21,34,2,3,567,21};
        System.out.println("Length: "+a1.length);

        for(int i =0; i < a1.length; i++) {
            for (int j = i+1; j < a1.length; j++) {
                if(a1[i] == a1[j]){
                    System.out.println(a1[j]);
                }
            }
        }*/

//        reverse an array
//        Integer [] a1 ={1,2,3,4,5,6,7,8,9};
//        reverse(a1);


        int [] a1 ={1,2,3,4,1,2,6,7,8,5,6,7,8,9};
        HashSet set = new HashSet();

        for(int i : a1){
            set.add(i);
        }
        System.out.println(set);





    }
    /*static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }*/

}

