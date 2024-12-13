// This example demponstrate defualt methods in interface
public interface MyIF {
    // This is a normal interface method declaration 
    // It does not define a default method implementation
    
    int getNumber();

    // This is a defualt method. Notice that it provides
    // a defualt implementation
    default String getString() {
        return "Default string";
    }
}

// Implement MyIF.
class MyIFImp implements MyIF {
    // Only getNumber() defined by MyIF needs to be implemented
    // getString() can be allowed to defualt
    public int getNumber() {
        return 100;
    }
}

// use the default method 
public class DefaultMethodDemo {
    public static void main(String args[]) {

        MyIFImp obj = new MyIFImp();
        
        // can call getNumber(), because it is explicitly
        // implemented by MyIFImp
        System.out.println(obj.getNumber());
        
        // can also call getString(), because of 
        // default implementation
        System.out.println(obj.getString());
    }
}

