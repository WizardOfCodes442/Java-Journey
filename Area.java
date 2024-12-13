import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        //create a scanner object
        Scanner input = new Scanner(System.in);

        //prompt user to enter a radius
        double radius = input.nextDouble();

        //compute area
        double area = radius * radius * 3.14159;

        //display result
        System.out.println("The area of the circle of radius " + radius + " is " + area);
    }
}
