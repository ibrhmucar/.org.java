package day40_accessmodifiers_final_hiding;

import java.util.ArrayList;

public class FinalArrayList {
    public static void main(String[] args) {

        final ArrayList<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("Red");
        colors.remove(0);
        System.out.println(colors);

        //   colors = new ArrayList<String>();  we Cannot assign a value to final variable 'colors'



    }
}
