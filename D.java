//C's j is not accessible here
public class D extends C {
    int total;
    void sum() {
        total = i + j; //ERROR , j is accessible here
    }
    
}