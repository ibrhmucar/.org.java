package day40_accessmodifiers_final_hiding_2;

import day40_accessmodifiers_final_hiding.Car;

public class Car2 extends Car {

    public Car2(){

     //   model="M3"; //default, no accessible to subclass outside the same package
        year=2017; //public
        engine=2.4; // protected
     //   door=4; //private



    }




}
