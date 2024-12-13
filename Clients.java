public class Clients implements CallBack {
    // Implement Callback's interface
    // when you implement an interface method, it must be declared as public
    public void callBack(int p) {
        System.out.println("callback called with " + p);

    }
    // it is possible and permissible for classes that implements interfaces 
    // to define additional members of their own . 
    void nonInterfaceMeth() {
        System.out.println("Classes that implements interfaces may also define other members, too.");
    }
}
