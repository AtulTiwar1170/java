package Function;
import java.util.*;
public class NumberNegativeOrPossitive {
    //Write a Python program to check if a number is positive, negative, or zero
    public static void negativOrPossitive( int number){
        if( number == 0){
            System.out.println("This is Zero::");
        }else if(number < 0){
            System.out.println("This is Negative Number::");
        }else{
            System.out.println("This is Possitive Number::");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        negativOrPossitive(Number);
        sc.close();
    }
}
