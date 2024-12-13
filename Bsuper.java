//Create a subclass by extending class Asuper
public class Bsuper extends Asuper {
    int i; // this i hides i in Asuper

    Bsuper(int a, int b) {
        super.i = a; // i in Asuper
        i = b; // i in Bsuper

    }

    void show() {
        System.out.println("i in superclass : " super.i);
        System.out.println("i in subclass: " + i);
    }
    
}