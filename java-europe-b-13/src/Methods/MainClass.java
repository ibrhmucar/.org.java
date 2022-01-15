package Methods;

public class MainClass {
    public static void main(String[] args) throws Exception{

        try {
            math(50, 0);
        }catch (Exception e){
            System.out.println("Hata");
        }
        
        System.out.println("this line is too");

    }

    public static void math(int num1, int num2){

        System.out.println(num1 / num2);
        throw new ArithmeticException("Hata");


    }

}
