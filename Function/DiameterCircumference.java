package Function;
import java.util.*;
public class DiameterCircumference {
    //Write a C program to input radius of a circle from user and find diameter, circumference and area of the circle.
    
    public static void diameterCircumAndAreaofCircle(double r){
        final double pi = 3.14;
        // Find diameter
        
        double diameter = 2*r;
        System.out.println("Diameter of Circle ::");
        System.out.println(diameter);

        //Find area of the circle.
        
        double areaOfCircle = pi*(r*r);
        System.out.println("Area of Circle ::");
        System.out.println(areaOfCircle);

        //Find circumfersnce
        
        double circumference = 2*pi*r;
        System.out.println("Circumference of Circle::");
        System.out.println(circumference);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Radius::");
        double radius = sc.nextFloat();
        diameterCircumAndAreaofCircle(radius);
        sc.close();
    }
}
