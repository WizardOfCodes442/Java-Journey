//This program uses inheritance to extend box
public class Box01 {
    double width;
    double height;
    double depth;

    // construct clone of an object
    Box01(Box01 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    //constructor used when all dimensions are specified
    Box01(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //Constructor used when no dimensions are specified
    Box01() {
        /**
         * use -1 to indicate an uninitialized box
         */
        width = -1;
        height = -1;
        depth = -1;
        
    }

    //Constructor used when a cube created
    Box01(double len) {
        width = height = depth = len;
    }

    //compute and return volume
    double volume() {
        return width * height * depth;
    }
}