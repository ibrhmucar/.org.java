package day40_accessmodifiers_final_hiding;

public class Kangaroo extends Marsupial{

    public static boolean isBiped(){
        return true;

    }

    public void getKangarooDescription(){
        System.out.println("Kangaroo hoops on two legs : " + isBiped());
    }

}
