/**
step 2

Create concrete classes implementing thesame interface */
public class Circle implements Shape {
    @Override
    public void draw(){
        System.out.println("Inside Circle::draw() method.");
    }
}