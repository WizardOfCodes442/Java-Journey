public class ScopeDemo {
    private int x = 1;
    
    public void f() {
        int y = 2;
        for (int z = 3; z < 10; z++) {
            System.out.println(x+y+z);
        }
    }
}