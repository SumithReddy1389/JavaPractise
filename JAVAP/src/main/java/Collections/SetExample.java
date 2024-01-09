package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();

        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(6);

        System.out.println("Original: "+h);

        Iterator<Integer> itr = h.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        itr.forEachRemaining(i -> {
//            System.out.println(i);
            if(i % 2 == 0){
                System.out.print("Even: "+i);
                System.out.print(" ");
            }
        });
        h.add(7);
        h.add(8);
        h.add(9);
        h.add(10);
        System.out.println("Original: "+h);

        if(h.contains(8)){
            h.remove(8);
        }
        System.out.println("After Remove: "+h);

        HashSet<Integer> h1 = new HashSet<>();
        h1.add(7);
        h1.add(8);
        h1.add(9);
        h1.add(10);


        h.removeAll(h1);  //the difference between the two sets,
        System.out.println("New Map: "+h1);
        System.out.println("After remove all: " +h);
        h1.add(1);
        h1.add(2);
        h1.add(3);
        h1.retainAll(h);
        System.out.println("Retain: "+h);

//        To check if a set is a subset of another set or not, we can use the containsAll() method
        HashSet<Integer> h2 = new HashSet<>();
        h2.add(1);
        h2.add(2);

        System.out.println("Is Subset: "+h.containsAll(h2));

        if(!(h2.isEmpty())){
            System.out.println(h2);
            h2.clear();
            System.out.println(h2);
        }
        if(h2.isEmpty()){
            h2 = (HashSet<Integer>) h1.clone();
            System.out.println(h2);
        }
    }
}
