package day40_accessmodifiers_final_hiding_2;

import day40_accessmodifiers_final_hiding.Car;

public class CarTest {
    public static void main(String[] args) {

        Car c;
        c = new Car();

        //  c.model="M3"; //default
          c.year=2017; //public
      //  c.engine=2.4; // protected
      //  c.door=4; //private


       // System.out.println(c.toString());


    }
}
