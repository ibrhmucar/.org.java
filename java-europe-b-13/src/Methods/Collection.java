package Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class Collection {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.add(4);
        number.add(3);
        number.add(1);

        //System.out.println(number.toString());

        Collections.sort(number);
        System.out.println(number);


    }
}
