                    CONCEPT
Abstract Factory patterns work around a super-factory which creates other factories
This factory is also called the factory of factories .this type of design pattern comes
under creational pattern as this pattern provides one of the best way to create an object

In Abstract Factory Pattern an interface is responsible for creating a factory of related 
objects without explicitly specifying their classes . Each generated factory can give 
the objects as per the factory pattern.

                IMPLEMENTATION
We are going to create a Shape interface and a concrete class implementing it .
We create an abstract factory class AbstractFactory as next step. Factory class
ShapeFactory is defined which extends AbstractFactory. A factory creator/generator 
class FactoryProducer is created.

AbstractFactoryPatternDemo, our demo class uses FactoryProducer to get a AbstractFactory 
object. It will pass information (CIRCLE/ RECTANGLE / SQUARE for Shape) to AbstractFactory
to get the type of object it needs.


