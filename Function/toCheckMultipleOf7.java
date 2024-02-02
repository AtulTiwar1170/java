package Function;
import java.util.*;
public class toCheckMultipleOf7 {
    //Write a Python program to check if a number is a multiple of 3 or 5
    public static void multipleOf7(int num){
        if( num % 7 == 0){
            System.out.println("This is multiple of 7");
        }else{
            System.out.println("This is not multiple of 7");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of checkNumber");
        int checkNumber = sc.nextInt();
        multipleOf7(checkNumber);
        sc.close();
    }
}
