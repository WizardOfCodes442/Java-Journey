/**
Factory pattern s one of the most used patterns in java.
This type of design pattern comes under the creational pattern
As this pattern provide one of the best way to create an object

In factory pattern we create object without exposing the creation logic to the client and refer 
to newly created object using a common interface

        IMPLEMENTATION
We're going to create a Shape interface and concrete classes implementing the interface
A factory class ShapeFactory is created as the next step

FactoryPatternDemo, our demo class will use ShapeFactory to get a Shape object, It will pass information 
(CIRCLE, RECTANGLE, SQUARE) to get the type of object it needs
 */
 public interface Shape {
     void draw();
 }