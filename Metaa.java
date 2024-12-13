import java.lang.annotation.*;
import java.lang.reflect.*;

public class Metaa {
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnno {
        String str();
        int val();
    }

    @MyAnno {
        str = "My Method";
        val = 100;
    }
    public static void MyMeth() {
        Metaa ob = new Metaa();
        
        //obtain annotation for this method and display the example
        try {

            // first get a class object that represent this class
            Class<?> c = ob.getClass();

            // Now, get a method that represents this method
            Method m = c.getMethod("MyMeth");

            //Next, get the annotation for this class
            MyAnno anno = m.getAnnotation(MyAnno.class);

            // finally display the values 
            System.out.println(anno.str() + " " + anno.val());
        } catch(NoSuchMethodException exc) {
            System.out.println("Method not found");
        }

        public static void main(String args[]) {
            myMeth();
        }
    }
}