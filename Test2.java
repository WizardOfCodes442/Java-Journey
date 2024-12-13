public class Test2 {
    int a, b;
    Test2(int i, int j) {
        a = i;
        b = j;
    }
    //pass an object
    void meth(Test2 O){
        O.a *= 2;
        O.b /= 2;
        
    }
}