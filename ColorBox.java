/**
 * 
 * 
 * 
 * A major advantage of inheritance is that once you have created a superclass that defines
the attributes common to a set of objects, it can be used to create any number of more specific
subclasses. Each subclass can precisely tailor its own classification. For example, the following
class inherits Box and adds a color attribute:
 */
public class ColorBox extends Box2 {
    int color; // define color of box

    ColorBox(double w, double h, double d, int c){
        width = w;
        height = h;
        depth = d;
        color = c;

    }
    
}