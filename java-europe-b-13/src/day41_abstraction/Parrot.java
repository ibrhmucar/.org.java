package day41_abstraction;

public class Parrot extends Bird{


    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {

    }

    @Override
    public int eat(String x) {
        return 0;
    }
}
