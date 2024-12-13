// Objects may be passed to methods
public class Test {
    int a, b;

    Test(int i, int j){
        a = j;
        b = i;

    }
    // return true if o is equal to the invoking object 
    boolean equals(Test o){
        if (o.a == a && o.b == b) return true;
        else return false;
    }
    
    
}