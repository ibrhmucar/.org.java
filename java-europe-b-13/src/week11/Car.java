package week11;

public class Car {

    public  String color, model, make;
    public int year;

    public Car(String color, String model, String make, int year) {
        this.color = color;
        this.model = model;
        this.make = make;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public  int getYear() {
        return year;
    }
}
