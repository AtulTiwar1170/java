package Function;
import java.util.*;
public class EvenOdd {
    public static void evenOdd(int x) {
        if( x % 2 == 0){
            System.out.println("This is Even Number::");
        }else{
            System.out.println("This is Odd Number::");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        evenOdd(N);
        sc.close();
    }
}
