package day45_exceptions;

public class TryCatch {
    public static void main(String[] args) {

        String str = "JAVA";


       try {
           System.out.println(str.charAt(0));
           System.out.println(str.charAt(5));
           System.out.println(str.charAt(2));

       }catch (StringIndexOutOfBoundsException e){

           System.out.println("Some problem has been occur");
           // e.printStackTrace();
           System.out.println(e.getMessage());

       }

        System.out.println("After try catch block ");







    }
}
