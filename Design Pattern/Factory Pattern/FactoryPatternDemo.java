/**
step 4

Use the Factory to get Object of concrete class by passing an information 
such as type */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of circle and call it draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of circle
        shape1.draw();

        //get an object of Rectangle and call its draw method
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and its draw method
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of Square
        shape3.draw();
    }
}