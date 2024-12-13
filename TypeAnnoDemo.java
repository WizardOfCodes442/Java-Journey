// Demonstrate several type annotation 
import java.lang.annotation.*;
import java.lang.reflect.*;

// A marker annotation can be applied to a type
@Target(ElementType.TYPE_USE)
@interface TypeAnno {}

// Another marker annotation can be applied to type
@Target(ElementType.TYPE_USE)
@interface NotZeroLen{

}

// Still another annotation that can aplied to a type 
@Target (ElementType.TYPE_USE)
@interface Unique { }

//still another marker annotation that can be applied to a type 
@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

// A parameterized annotation that can be applied to a type
@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

// An annotation that can be applied to a type parameter
@Target (ElementType.TYPE_PARAMETER)
@interface What {
    String description();
}



// An annotation that can applied to a field declaration    
@Target (ElementType.FIELD)
@interface EmptyOk {}

// An annotation that can be applied to a method declaration
@Target (ElementType.METHOD)
@interface Recommended {}

//use an annotation o a type parameter
class TypeAnnoDemo<@What (description = "Generic data type" ) T> {
    
    // use a type annotation on a constructor 
    public @Unique TypeAnnoDemo() {}

    // Annotate the type (in this case String) , not the field
    @TypeAnno String str;

    // This annotate rthe empty field test
    @EmptyOk String test;

    // use a type annotation to annotate this , the reciever
    public int f (@TypeAnno TypeAnnoDemo<T> this, int x) {
        return 10;
    }

    // Annotate the return type 
    public @TypeAnno Integer f2 (int j , int k) {
        return j+k;
    }

    // Annotate the method declaration
    public @Recommended Integer f3(String str) {
        return str.length()/2
    }

    // use a type annotation with throws clause 
    public void f4() throws @TypeAnno NullPointerException {
        //...
    }

    // Annotate array levels
    String @MaxLen(10) [] @NotZeroLen [] w;


    // Annotate the array element type
    @TypeAnno Integer[] vec;

    public static void myMeth(int i) {
        // Use a type annotation on atype argument
        TypeAnnoDemo<@TypeAnno Integer> ob = new TypeAnnoDemo<@TypeAnno Integer>();

        // use a type allocation with new
        @Unique TypeAnnoDemo<Integer> ob2 = new @Unique TypeAnnoDemo<Integer>();

        Object x = Integer.valueOf(10);
        Integer y;

        // use a type annotation on a cast
        y = (@TypeAnno Integer) x;

    }

    public static void main(String args[]) {
        myMeth(10);
    }

    // use type annotation with inheritance clause
    class Someclass extends @TypeAnno TypeAnnoDemo<Boolean> {}
}