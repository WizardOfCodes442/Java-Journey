/**
step 2

Create concrete classes implementing thesame interface */
public class Square implements Shape {
    @Override
    public void draw(){
        System.out.println("Inside Square::draw() method.");
    }
}