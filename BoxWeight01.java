//here Box01 is extended to include weight
public class BoxWeight01 extends Box01 {
    double weight;  // weight of the box

    BoxWeight01 (double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }

}