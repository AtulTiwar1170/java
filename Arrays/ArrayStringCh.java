package Arrays;
import java.util.*;
public class ArrayStringCh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array::");
        int Size = sc.nextInt();

        String[] arrString = new String[Size];
        System.out.println("Enter the elements of an array are::");

        for(int i=0; i<Size; i++){
            arrString[i] = sc.nextLine();
        }

        System.out.println("Display the elements of an Array::");
        for(int i=0; i<arrString.length; i++){
            System.out.println(arrString[i]);
        }

        System.out.println("Enter name for searching in array::");
        String name = sc.nextLine();
        for(int i=0; i<arrString.length; i++){
            if(arrString[i] == name ){
                System.out.println("Name of a person is "+ arrString[i] + "index of the person name is "+ i);
            }
        }
        sc.close();
    }
}
