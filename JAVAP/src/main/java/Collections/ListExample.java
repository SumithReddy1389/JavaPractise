package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
    public static void main(String[] args) {
//        convert Array to List
        String [] a1 = {"Java","Python","PHP","C++"};

        List<String> l1 = new ArrayList<>();
        Collections.addAll(l1, a1);
        System.out.println(l1);

        // Convert List to Array
        List<String> l2 = new ArrayList<>();
        l2.add("Java");
        l2.add("Python");
        l2.add("PHP");
        l2.add("C++");
        String[] a2 = l2.toArray(new String[0]);
        System.out.println(a2[2]);

        // get set in List
        l2.set(2,"JS");
        System.out.println(l2);
        System.out.println(l2.get(3));

        // Sorting
        Collections.sort(l2);
        System.out.println(l2);

        ListIterator<String> iterator = l2.listIterator();
        while (iterator.hasNext()){
            System.out.println("By hasNext() :"+ iterator.next());
        }

        while (iterator.hasPrevious()){
            System.out.println("By hasPrevious() :"+iterator.previous());

        }

    }
}
