package Arrays;
import java.util.*;
public class MinMaxValue {//This program is used to find mnimum and maximum numbers in an array?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array::");
        int Size = sc.nextInt();
        int[] arr = new int[Size];
        System.out.print("Enter the eleent of an Array::");
        for(int i=0; i<Size; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        System.out.println("Maximum number in array is::");
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }System.out.println(max);
        int min = arr[0];
        System.out.println("Manimum number in array is::");
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                max = arr[i];
            }
        }System.out.println(min);
        sc.close();
    }
}
