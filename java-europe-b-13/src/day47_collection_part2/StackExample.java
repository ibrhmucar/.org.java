package day47_collection_part2;

import java.util.Stack;
import java.util.Vector;

public class StackExample {
    public static void main(String[] args) {

        Vector<Integer> numsStack = new Stack<>();

        numsStack.add(80);
        numsStack.add(50);
        numsStack.add(70);
        numsStack.add(500);
        numsStack.add(50);  // top of the table

        System.out.println(numsStack.toString());

        //check value on top of stack

        System.out.println(((Stack<Integer>) numsStack).peek());

        //read value on top of stack then remove it

        System.out.println(((Stack<Integer>) numsStack).pop());
        System.out.println(numsStack.toString()); // after removed to 50, 500 is the element which that is the top of the table


        System.out.println(((Stack<Integer>) numsStack).peek());

        //Last In First Out

    }
}
