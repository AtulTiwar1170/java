package Function;
import java.util.*;
public class isMultipleOf3Or5 {
    public static void isMultiple(int num){
        //Write a Python program to check if a number is a multiple of 3 or 5
        if(num % 3 == 0 || num % 5 == 0){
            System.out.println("This number is multiple of 3 and 5:::");
        }else{
            System.out.println("This number is not multiple of 3 and 5 ::");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of checkNumber");
        int checkNumber = sc.nextInt();
        isMultiple(checkNumber);
        sc.close();
    }
}
