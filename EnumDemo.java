// an enumeration of apple varieties
enum Apple{
    Jonathan, GoldenDel, RedDel, WineSap, Cortland
}

public class EnumDemo {
    public static void main(String args[]) {
        Apple ap;
        ap = Apple.RedDel;

        //output an enum value
        System.out.println("Value of ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        // compare two enum values
        if (ap == Apple.GoldenDel)
            System.out.println("ap contains Goldendel.\n");

        // use an enum to control a switch statement
        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan is red");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is yellow");
                break;
            case RedDel:
                System.out.println("Red Delicious is blue");
                break;
            case WineSap:
                System.out.println("Winesap is pink");
                break;
            case Cortland:
                System.out.println("Cortland is green");
                break;
        }

        System.out.println("Here are all the apple constants");

        //use values()
        Apple allapples[] = Apple.values();
        for (Apple a : allapples)
            System.out.println(a);
        
        System.out.println();

        // use valueOf
        ap = Apple.valueOf("WineSap");
        System.out.println("ap contains " + ap);
    }
    
}
