package Function;
import java.util.*;
public class BooleanPalindromeNumber {
    public static boolean palindromeNumber(int x){
        int Reminder = 0, Sum = 0 ;
        int temp = x;
        while( x != 0){
            Reminder = x % 10;
            Sum = (Sum*10) + Reminder;
            x = x/10;
        }
        return temp == Sum;
    }
    public static void main(String[] args){
        // This program is used to find number is Palindrome or not uusing Boolean return type
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n::");
        int n = sc.nextInt();
        if(palindromeNumber(n)){
            System.out.println("This is Palindrome Number::");
        }else{
            System.out.println("This is not Palindrome Number::");
        }
        sc.close();
    }
    
}
