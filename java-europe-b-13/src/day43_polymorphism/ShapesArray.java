package day43_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapesArray {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Shape();
        shapes[1] = new Triangle();
        shapes[2] = new Circle();



       for (int i=0 ; i< shapes.length ; i++){
           System.out.println(shapes[i].getClass().getName());
           System.out.println(shapes[i].getClass().getSimpleName());
           shapes[i].draw();
        }


        List<Shape> shapeList = new ArrayList<>();

        shapeList.add(new Triangle());
        shapeList.add(new Circle());
        shapeList.add(new Square());



    }
}
