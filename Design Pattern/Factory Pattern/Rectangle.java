/**
step 2

Create concrete classes implementing thesame interface */
public class Rectangle implements Shape {
    @Override
    public void draw(){
        System.out.println("Inside Rectangle::draw() method");
    }
}