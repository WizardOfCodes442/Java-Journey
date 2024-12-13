/**
Step 5
Create a Factory generator/producer class to get factories by passing information 
such as shape  */
public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if (rounded){
            return new RoundedShapeFactory();
        }
        else {
            return new ShapeFactory();
        }
    }
}