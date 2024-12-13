public class OverloadCons {
    public static void main(String[] args){
        // create boxes using different constructors
        Boxx mybox1 = new Boxx(10, 15, 20);
        Boxx mybox2 = new Boxx();
        Boxx mycube = new Boxx(7);
        double vol;

        // get volume of first box
         vol = mybox1.volume();
         System.out.println("Volume of mybox1 is " + vol);

         // get volume of second box
         vol = mybox2.volume();
         System.out.println("Volume of mybox2 is " + vol);

         // get volume of cube
         vol = mycube.volume();
         System.out.println("Volume of mycube is " + vol);

    }
    
}