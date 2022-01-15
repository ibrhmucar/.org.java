package day48_collection_part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        List<Integer> item2 = new ArrayList<>();

        item2.add(10);
        System.out.println(item2.get(0));
        System.out.println(item2.toString());

        Map<String,Double> items = new HashMap<>();

        items.put("apple",3.49);
        items.put("flowers",10.99);
        items.put("eggs",4.99);
        items.put("milk",6.0);
        items.put("cherries",5.99);

        System.out.println(items.size());
        System.out.println(items.toString());

        System.out.println(items.isEmpty());
        System.out.println(items.get("apple"));
        System.out.println(items.get("milk"));
        System.out.println(items.keySet());

        items.remove("apple");
        System.out.println( items.toString());

        System.out.println("Is apple there?  " +  items.containsKey("apple") );
        System.out.println("Is Flowers there?  " + items.containsKey("flowers"));

        items.replace("eggs" ,3.5);
        System.out.println("Price of eggs "  + items.get("eggs"));

        items.put("milk",2.6);
        System.out.println("Price of milk " + items.get("milk"));

        items.replace("cherries",items.get("cherries")+2);
        System.out.println(items.get("cherries"));

        items.replace("cherries",7.99,9.99);
        System.out.println(items.get("cherries"));


    }
}
