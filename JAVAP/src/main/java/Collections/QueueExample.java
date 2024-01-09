package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
//    FIFO or the First-In-First-Out principle.
public static void main(String[] args) {
    Queue<String> queue = new LinkedList<String>();
    queue.add("one");
    queue.add("two");
    queue.add("three");
    queue.add("four");

    System.out.println("Original :"+ queue);

}
}
