package Arrays;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an array::");
        int Size = sc.nextInt();
        int[] arr = new int[Size];
        System.out.println("Enter the Elements of an array::");
        for(int i=0; i<Size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of x for searching in array::");
        int x = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if( arr[i] == x){
                System.out.println("Element is ::" + arr[i] + " index of element is::" + i);
            }
        }
        sc.close();
    }
}
