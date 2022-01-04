package day45_exceptions;

import java.util.Locale;

public class ORCatchBlock {

    static String str = "abc";

    public static void main(String[] args) {



        try {
            System.out.println(str.toUpperCase());
        }catch (IllegalArgumentException | NullPointerException e){
            e.printStackTrace();
        }
    }
}
