package TwoDArray;
import java.util.*;
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of an Row::");
        int row = sc.nextInt();
        System.out.println("Enter the Column of an array::");
        int column = sc.nextInt();
        System.out.println("Enter the element of row and column in array::");
        int[][] arr = new int[row][column];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Display the elements of 2D array::");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}