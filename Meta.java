import java.lang.annotation.*;
import java.lang.reflect.*;

// An annotation type declaration
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();

}
public class Meta {
    // Annotate a method 
    @MyAnno(str ="Annotation Example", val = 100)
    public static void MyMeth() {
        Meta ob = new Meta();

        //Obtain the annotation for this method 
        // and display the values of the members

        try {
            // First , get a class  object that represent this class
            Class<?> c = ob.getClass();

            // Now get a method that represents  this method
            Method m = c.getMethod("MyMeth");
            
            //Next, get the annotation for this class 
            MyAnno anno = m.getAnnotation(MyAnno.class);

            // Finally , display the values .
            System.out.println(anno.str() + " " + anno.val());
        } catch(NoSuchMethodException esc) {
            System.out.println("Method not found");
        }
    }

    public static void main(String args[]) {
        MyMeth();
    }
}
