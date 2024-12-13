import java.awt.Point;
class Box {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    Box buildBox(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        return this;

    }

    /**
    
    alternate method to build box with point object
     */
    Box buildBox(Point topLeft, Point bottomRight) {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;
        return this;
    }

    /**
    another way to build a rectangle is to use corner a width and a height
     */
    Box buildBox(Point topLeft, int h, int w){
        x1 = topLeft.x;
        y2 = topLeft.y;
        x2 = (x1 + w);
        y2 = (y1 + h);
        return this;
    }

    void printBox() {
        System.out.print("Box: <" + x1 + ", " + y1);
        System.out.println(", " + x2 + ", " + y2 + " >");
    }

    public static void main(String[] args) {
        Box rect = new Box();
        
        System.out.println("\nCalling buildBox with " + "Coordinates (25, 25) and (50, 50)");
        rect.buildBox(25, 25, 50, 50);
        rect.printBox();

        System.out.println("\nCalling buildBox with " + "points (10, 10) and (20, 20)");
        rect.buildBox(new Point(10, 10), new Point(20, 20));
        rect.printBox();

        System.out.println("\nCalling buildBox with " + "points (10, 10) and width 50 and height 50: ");
        rect.buildBox(new Point(10, 10), 50, 50);
        rect.printBox();
    }
}