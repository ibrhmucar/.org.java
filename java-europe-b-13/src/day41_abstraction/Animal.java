package day41_abstraction;

public abstract class Animal {


    public Animal (String name){

    }

    public abstract int eat(String x);

    public abstract void eat();

    public abstract void breath();

    public abstract void sleep();

    public void move (){

        System.out.println("Moving");
    }

}
