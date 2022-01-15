package day47_collection_part2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("Mike");
        queue.add("Ozzy");
        queue.add("Jamal");
        queue.add("Asiya");

        System.out.println(queue.toString());
        System.out.println(queue.peek());

        queue.remove();
        System.out.println(queue);

        System.out.println(queue.peek()); // it's shows first element

        queue.poll();// same with remove
        System.out.println(queue.toString());

        System.out.println(queue.peek());

    }
}
