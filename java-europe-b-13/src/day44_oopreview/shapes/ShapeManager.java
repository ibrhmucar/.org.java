package day44_oopreview.shapes;

import java.util.List;

public class ShapeManager {

    public static Shape buildShape(String type) {

            Shape shape = null;

        if (type.equals("Square")) {

            return shape = new Square();

        } else if (type.equals("Diamond")) {

            return  shape= new Diamond();

        } else {

            return shape = new Shape();
        }

    }

    public static void drawSquare(Square squareObject){

        squareObject.draw();

    }

    public static void drawShape(Shape shapeObject){
        shapeObject.draw();

    }

    public static void drawShape(List<Shape> shapeList ){

        for(Shape each : shapeList){
            each.draw();
        }


    }




}



