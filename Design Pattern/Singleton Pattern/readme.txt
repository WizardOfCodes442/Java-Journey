
                    Concept
Singleton is one of the simplest design pattern in java .The type of design comes under the creational 
as this pattern provides one of the best way to create an object 
Thi pattern involves a single class which is responsible to create an object while making sure 
that only single object get created . This class provides a way to access its only object which can be 
accessed directly without need to instantiate the object of the class . 


                Implementatation

    We are going to create a SingleObject class . SingleObject class have its constructor as a private 
    and have a static instance of itself. 
    SingleObject class provides a static method to get its static instance to outside world. 
    SingletonPatternDemo, our class will use SingleObject class to get a SingleObject object. 