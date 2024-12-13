/**
STEP 2
get the only object from the singleton class

SingletonPatternDemo.java
*/

public class SingletonPatternDemo {
    public static void main(String[] args){
        //illegal construct 
        //Compile Time Error : The constructor SingleOject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available 
        SingleObject object = SingleObject.getInstance();

        //show message 
        object.showMessage();
    }

}