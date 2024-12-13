public class DemoBox {
    public static void main(String args[]) {
        BoxWeight01 mybox1 = new BoxWeight01(10, 20, 15, 34.3);
        BoxWeight01 mybox2 = new BoxWeight01(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
        System.out.println();
    }    
}