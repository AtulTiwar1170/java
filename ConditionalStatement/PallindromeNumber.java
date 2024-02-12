package ConditionalStatement;
import java.util.*;
public class PallindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r,sum = 0;
        int temp = n;
        while( n > 0){
            r = n % 10; //Reminder
            sum = (sum * 10) + r;
            n =n / 10;
        }
        if( temp == sum){
            System.out.println("This is pallindrome Number.");
        }else{
            System.out.println("This is not Pallindrome Number::");
        }
        sc.close();   
    }
}
//complete
