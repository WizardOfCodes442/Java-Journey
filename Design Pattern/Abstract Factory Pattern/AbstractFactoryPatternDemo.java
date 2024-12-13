/**
Step 6

Use the FactoryProducer to get AbstractFactory in order to get factories of concrete classes
by passing an information such as type  */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        //get an object of shape rectangle
        Shape shape1  = shapeFactory.getShape("Rectangle");
        //call the draw method of Shape rectangle
        shape1.draw();
        //get an object of Shape square
        Shape shape2 = shapeFactory.getShape("Square");
        //call the draw method of shape square
        shape2.draw();
        //get shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        //get an object of shape rectangle
        Shape shape3 = shapeFactory1.getShape("Rectangle");
        //call the draw method of the Shape Rectangle
        shape3.draw();
        //get an object of shape square
        Shape shape4 = shapeFactory1.getShape("Square");
        //call the draw method of shape Square
        shape4.draw();
        
    }
}