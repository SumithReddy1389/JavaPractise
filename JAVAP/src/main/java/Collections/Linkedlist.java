package Collections;

import java.util.LinkedList;

public class Linkedlist {

//    LinkedList is better for manipulating data.
    // No initial capacity

//    When the rate of addition or removal rate is more than the read scenarios, then go for the LinkedList.
//    On the other hand, when the frequency of the read scenarios is more than the addition or removal rate,
//    then ArrayList takes precedence over LinkedList.


    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("One");
        ll.add("Two");
        ll.add("Four");
        ll.add(2,"Three");
        ll.add("One");
        ll.add("Five");
        ll.add("Four");

        System.out.println(ll);

        LinkedList<String> l2 = new  LinkedList<String>();
        l2.add("1");
        l2.add("2");
        l2.add("3");
        l2.add("4");
        System.out.println(l2);

        LinkedList<String> l3 = new  LinkedList<String>();
        l3.addAll(ll);
        l3.addAll(0,l2);

        l3.addFirst("zero");
        l3.addLast("00000");
        System.out.println(l3);

        l3.removeAll(l2);
        System.out.println(l3);

        l3.removeFirst();
        System.out.println(l3);

        l3.removeLast();
        System.out.println(l3);

        l3.removeFirstOccurrence("One");
        System.out.println(l3);

        l3.removeLastOccurrence("Four");
        System.out.println(l3);

        l3.offer("OFFER");
        System.out.println(l3);

        l3.offerFirst("OFFERfIRST");
        System.out.println(l3);

        l3.offerLast("OFFERlAST");
        System.out.println(l3);


        // peek -- retrieves the head (first element)
        // peekFirst, peekLast
        // poll -- retrieves and removes  head
        // pollFirst, pollLast

    }
    }
