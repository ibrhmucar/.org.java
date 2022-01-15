package day47_collection_part2;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> myset = new HashSet<>();

        myset.add(100);
        myset.add(500);
        myset.add(800);
        myset.add(900);
        myset.add(1000);
        myset.add(1000);
        myset.add(1000);



        System.out.println(myset.toString());
        System.out.println(myset.size());


        List<String > list = Arrays.asList("23","23","a","a","bb","jj","q","t","t");

        Set<String> unique = new HashSet<>(list);

        System.out.println(unique.toString());
        System.out.println(list.toString());


        TreeSet<Integer> tSet = new TreeSet<>();

        tSet.add(500);
        tSet.add(500);
        tSet.add(50);
        tSet.add(70);
        tSet.add(90);
        tSet.add(100);

        System.out.println(tSet.toString());

        TreeSet<String> newTreeSet = new TreeSet<>(list);
        System.out.println(newTreeSet.toString());


    }
}
