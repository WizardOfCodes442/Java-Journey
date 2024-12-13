  public class TestIface {

    // yoy can declare variables as object references tahatr use an interface rather
    // than a class type. Any instance of any class that implements the declared interface 
    // can be referred to by such a variable. when you call a method through one of these 
    // references, the correct version will be called based on actuall instance of the interface 
    // being referred to . This is one of the key features of interfaces. The method to be 
    // executed is looked up dynamically at run time , allowing classes to be created later 
    // than the code which calls method on them . The calling code can dispatch through an 
    // an interface without having to know anything about the "callee", This process 
    // is similar to using a superclass reference to access a subclass object
    // The following example calls the callback() method via an interface reference variable

    public static void main (String args[]) {
        CallBack c = new Clients();
        c.callBack(42);
    }

    
}
