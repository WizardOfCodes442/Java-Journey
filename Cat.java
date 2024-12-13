import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.processing.Generated;

public class Animal {
    public void speak();

    public String getType() {
        return "Generic animal";
    }
}

public class Cat  extends Animal {
    @Override
    public void speak(); {
        // This is a good override
        System.out.println("meow");
    }

    @Override
    public String gettype() {
        // compile tine error due to 
        //typo
        retun "cat";
    }
}

// @Twizzle is an annotation to method toggle()
@Twizzle
public void toggle() {

}

// Declares the annotation Twizzle
public @interface Twizzle {

}

/**
 * annotations may include an optional list of key-value pairs:
 * 
 */

// Same as : @Edible (value = true )
@Edible(true)
Item item = new Carrot();

public @interface Edible  {
    boolean value() default false;
}

@Author (first = "Oompah", last="Loompah")
Book book = new Book();
public @interface Author {
    String first();
    String last();
}

/**
 * annotations themselves can be annoted to indicate 
 * where and when they can be used 
 */

@Retention (RetentionPolicy.RUNTIME)
// make this annotation accessible at runtime via reflection

@Target ({ElementType.METHOD})
// This annotation can only be applied to class methods

public @interface Tweezable {}

/**
 *  Annotations are often used by frameworks as a
 *  way of convienently applying behaviours to user defined 
 *  classes and methods that must otherwise be declared in external 
 *  source (such as XML configuration file) or programmatically (with API calls)
 * 
 */

 @Entity
 // Declares this as entity bean
 
 @Table(name ="people")

 //Maps the bean to SQL table "people"

 public class Person implements Serializable {
     @Id 

     //Map this to the primary key column
    
     @GeneratedValue (strategy = GenerationType.AUTO) 
     // database will generate new primary keys not us

     private Integer id;

     @Column(length = 32)

     //Truncate column values to 32 characters

     private String name;

     public  Integer getId() {
         return id;
     }

     public void setId(Integer id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }

 // a complete example of 
 // java annotation usage in a jpa project

 import java.lang.annotation.Documented;

 import java.lang.annotation.ElementType;

 import java.lang.annotation.Inherited;

 import java.lang.annotation.Retention;

 import java.lang.annotation.RetentionPolicy;

 import java.lang.annotation.Target;

 @Documented
 @Retention (RetentionPolicy.RUNTIME)

 @Target ({ElementType.TYPE, ElementType.METHOD,
ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE,

ElementType.PACKAGE, ElementType.FIELD,ElementType.LOCAL_VARIABLE
})

@Inherited

public @interface Unfinished {
    PUBLIC ENUM Priority {
        LOW, MEDIUM, HIGH }
    String value();
    String[] changedBy() default "";
    String[] lastChangedBy() default "";
    Priority priority() default Priority.MEDIUM;
    String createdBy() default "James Gosling";
    String lastChanged() default "2011-07-08";
}

public @interface UnderConstruction {
    String Owner() default "Patrick Nauhgton";
    String value() default "Object is under construction";
    String CreatedBy() default "Mike Sheridan";
    String lastChanged() default "2011-07-08";
}

package com.validators;

import javax.faces.application.FacesMesaages;

import javax.faces.component.UIComponent;

import javax.faces.context.FacesContext;

import javax.faces.validator.ValidatorException;

import com.annotation.UnderConstruction;

import com.annotation.Unfinished;

import com.annotation.Unifinished.Priority;

import com.util.Util;

@UnderConstruction (owner = "Jon Doe")

public class DateValidator implements Validator {

    public void Vaidate (FacesContext context, UIComponent component, 
    Object value ) throws ValidatorException {
        String date = (String) value;
        String errorLabel ="please  enter ua valid date";
        
        if (!component.getAttributes().isEmpty()) {
            errorLabel = (String) component.getAttributes().get("errordisplayval");
        }

        if (!Util.validateAGivenDate(date) {
            @Unfinished (changedBy = "Steve",
             value = "Whether to add message to context or not , confirm",
             priority = Priority.HIGH)

            FacesMessage message = new FaceMessage();

            message.setSeverity(Faces)
        })
    }
} 
