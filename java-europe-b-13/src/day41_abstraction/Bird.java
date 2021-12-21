package day41_abstraction;

public abstract class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }


    @Override
    public void eat() {
        System.out.println("Bird eating");
    }

    @Override
    public void breath() {
        System.out.println("Birth breathing");
    }

    public abstract void fly();

}
