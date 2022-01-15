package day45_exceptions;

public class BadArray {
    public static void main(String[] args) {


        try {
 
            int[] number = {1, 2, 3};

            for (int i = 0; i <= number.length; i++) {
                System.out.println(number[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception running");

        }
        System.out.println("Learning exception");
    }
}