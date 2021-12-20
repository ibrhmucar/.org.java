package day40_accessmodifiers_final_hiding;

public class Final_Arrays {
    public static void main(String[] args) {
        final int[] teams = {11, 11};
        System.out.println(teams[0]);
        teams[0] = 15;


        //we can not ref. teams = new int[] {1,2};
        //but we can change the value teams[0]=16;



      /*  int[] nums = new int[]{20,20,40};
        nums = new int[] {10,15,100};

        final int[] finalNums = {23,366,44};
        finalNums[0]=120;  */



        //    but can not */ finalNums = new int[] {1,2,3,4}; Cannot assign a value to final variable 'finalNums'



    }
}