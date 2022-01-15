package day41_abstraction;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }//Class 'Dog' must either be declared abstract or implement abstract method 'eat()' in 'Animal'

    @Override
    public int eat(String x) {
        return 0;
    }

    @Override
    public void eat() {
        System.out.println("Dog eating dog food");
    }

    @Override
    public void breath() {
        System.out.println("Dog is breathing");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
