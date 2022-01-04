package day45_exceptions;

import java.util.Locale;

public class NullPointer {

    static String name;
    public static void main(String[] args) {

        try {
            System.out.println(name.toUpperCase());
        }catch (NullPointerException e){

            System.out.println(" NullPointerException happened");
            System.out.println(" Here is the message : " + e.getMessage());
            System.out.println(" here is the stack trace");
            e.printStackTrace();
        }finally {
            System.out.println( "this finally blocks works always");
           // System.exit(0);
        }


    }
}
