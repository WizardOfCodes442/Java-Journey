// some example to demonstrate the power of inheritance
public class Box2 {
    double width;
    double height;
    double depth;

    //construct clone of an object
    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //constructor used when all dimensions specified 
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimension is specified
    Box2() {
        width = -1; //use -1 to indicate 
        height = -1; // an uninitialized 
        depth = -1; // box

    }

    // constructor used when cube is created 
    Box2(double len) {
        width = height = depth = len;
    }

    //compute and return volume 
    double volume() {
        return width * height * depth;
    }
    
}