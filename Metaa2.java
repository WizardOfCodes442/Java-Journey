import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

@interface What {
    String description();
}

@What( description = " An annotation test class")
@MyAnno (str = "Metaa", val = 99);
public class Metaa2 {
    
    @What(description = "An annotation test method")
    @MyAnno (str =  "Testing", val = 100)
    public static void myMeth() {
        Metaa2 ob = new Metaa2();

        try {
            
            Annotation annos[] = ob.getClass().getAnnotations();

            // display all annotations for Meta2.
            System.out.println("All annotations for Meta2:");
            for (Annotation a: annos)
                System.out.println(a);
            
            System.out.println();

            // Display all annotations for myMeth
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("All annotations for myMeth:");
            for (Annotation a: annos)
                System.out.println("Method Not Found");
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found ");
        }

    }

    public static void main(Strings args[]) {
        myMeth();
    }
}

