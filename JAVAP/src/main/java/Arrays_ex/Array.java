package Arrays_ex;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0]=1;
        a[1]=1;
        a[2]=2;
        a[3]=3;
        System.out.println(a[0]);

        for(int i : a){
            System.out.println(i);
        }

        String s[] = {"one","two","three","four"};
        for(String s1 : s){
            System.out.print(s1);
            System.out.print(" ");
        }
        System.out.println();
        int[][] m = {{1,2,3},{4,5,6}};
        for(int i=0; i < m.length; i++){
            for(int j =0 ; j<m[i].length;j ++){
//                System.out.println(i);
//                System.out.println(j);
                System.out.println("Multi:"+m[i][j]);
            }
        }


// ArrayList to array
        // Create a new string array with the same size as the ArrayList.
//        String[] my_array = new String[list.size()];

        // Convert the ArrayList to an array and store it in my_array.
//        list.toArray(my_array);

// Array to ArrayList
//        ArrayList list = new ArrayList(Arrays.asList(my_array));
    }
}
