package Function;
import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args){
        // Find palindrome Number using function
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n ::");
        int n = sc.nextInt();
        palindromeNumber(n);
        sc.close();
    }
    public static void palindromeNumber(int x){
        int  sum = 0 , r = 0 ;
        int temp = x;
        while(x != 0){
            r = x % 10 ;//r = Reminder
            sum = (sum * 10) + r;
            x = x/10;
        }
        if( temp == sum){
            System.out.println("This is pallindrome Number.");
        }else{
            System.out.println("This is not Pallindrome Number::");
        }
    }
}
//complete

