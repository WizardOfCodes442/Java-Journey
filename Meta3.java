// show all annotations for a class and a method 
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface  MyAnno {
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What{
    String description();
}

@What (description = "An Annotation test class")
@MyAnno (str = "Meta3", val=99)

public class Meta3 {
    @What( description =  "An annotation test method") 
    @MyAnno (str ="Testing", val = 100)
    public static void  myMeth() {
        Meta3 ob = new Meta3();

        try {
            Annotation annos[] = ob.getClass().getAnnotations();

            // Display all annotations for meta3
            System.out.println("All annotation for Meta3");
            for (Annotation a: annos)
                System.out.println(a);
            
            System.out.println();

            // Display all annotations for myMeth
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("All annotation for myMeth:");
            for (Annotation a : annos)
                System.out.println(a);
        } catch (NoSuchMethodException esc) {
            System.out.println("Method Not Found");
        }
    }  
    public static void main(String args[]) {
        myMeth();
    }
}
