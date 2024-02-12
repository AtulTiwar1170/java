package Function;
import java.util.*;
public class FibonachiSeries {
    public static void main(String[] args){
        // Find Fibonachi Series by using Function in java
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find Fibonachi series::");
        int n = sc.nextInt();
        fibonachiSeries(n);
        sc.close();
        return;
    }
    public static void fibonachiSeries(int x){
        int t1 = 0 , t2 = 1 , nextTerm = 0;
        if( x == 0){
            System.out.println("Fibonachi Series::" + " " + t1);
        }else{
            System.out.println(t1+"\n"+t2);
            nextTerm = t1 + t2;
            while( nextTerm <= x){
                System.out.println(nextTerm);
                t1 = t2;
                t2 = nextTerm;
                nextTerm = t1 + t2;
            }
        }
    }
}
