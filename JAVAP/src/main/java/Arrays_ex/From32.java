package Arrays_ex;

public class From32 {

//    32. Write a Java program to check if an array of integers contains two specified elements 65 and 77.
    public static void findElement(int [] arr, int a, int b){
        boolean found = true;
        for(int i : arr){
            if(i == a || i == b){
                found = true;
            } else {
                found = false;
            }
        }
        if(found){
            System.out.println("Found the specified elemenet");
        } else {
            System.out.println("Not Found the specified elemenet");
        }
    }

//    33. Write a Java program to remove duplicate elements from a given array and return the updated array length.
//    Sample array: [20, 20, 30, 40, 50, 50, 50]
//    After removing the duplicate elements the program should return 4 as the new length of the array.

    public static int removeDuplicates(int [] arr){
        int index = 1;
        for(int i =0; i < arr.length; i++) {
            System.out.println("i : "+arr[i]);
            System.out.println("index: "+arr[index]);
                if(arr[i] != arr[index-1]) {
                    arr[index] = arr[i];
                    index++;
                }
            }
       return index;
    }

    public static void main(String[] args) {
        int[] array_nums = {77, 77, 65, 65, 65, 77};
        findElement( array_nums, 65, 7);

        int [] dup = {20, 20, 30, 40, 50, 50, 50};
        int [] a1 ={22,55,32,41,34,2,3,567,21,34,2,3,567,21};
        System.out.println(removeDuplicates(dup));

    }
}




