/**Here Box define three constructors to initialize 
 * the dimension of a box in various ways
 */
public class Boxx {
    double width;
    double height;
    double depth;

    //constructor used when all dimensions are specified
    Boxx (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //constructor used when no dimension are specified
    Boxx() {
        // use -1 to indicate an unitialized box
        width = -1;
        height = -1;
        depth = -1;

    }

    // constructor used when a cube is created
    Boxx(double len) {
        width = height = depth = len;
    }

    //compute and return volume
    double volume(){
        return width * depth * height;
    }
}