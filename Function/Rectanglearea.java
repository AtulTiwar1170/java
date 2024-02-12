package Function;
import java.util.*;
public class Rectanglearea {
    public static void areaOfRectangle(int x, int y){
        int area = x * y;
        System.out.println("This is the area of rectangle" + "" +area);
        return; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Length::");
        int L  = sc.nextInt();
        System.out.println("Enter the value of Breadth::");
        int B  = sc.nextInt();
        areaOfRectangle(L , B);
        sc.close();
    }
}
