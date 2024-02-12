package TwoDArray;
import java.util.*;
public class LinearSearch {//Search element x in 2D Array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an row::");
        int row = sc.nextInt();
        System.out.print("Enter the size of colms::");
        int colms = sc.nextInt();
        int[][] arr = new int[row][colms];
        System.out.println("Enter the elements of an array::");

        for(int i=0; i<row; i++){
            for(int j=0; j<colms; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Display the elements of an array::");
        for(int i=0; i<row; i++){
            for(int j=0; j<colms; j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
        System.out.println("Enter the number of x to find there index value");
        int x = sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0; j<colms; j++){
                if(arr[i][j] == x){
                    System.out.println(arr[i][j]+" "+"index of the array is:: "+ i +" Row "+j+" Column");
                }
            }
        }
        sc.close();
    }
}
