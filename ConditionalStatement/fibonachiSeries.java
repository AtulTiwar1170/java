package ConditionalStatement;

import java.util.Scanner;

public class fibonachiSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n to find Fibonachi series Numbers ::");
        int n = sc.nextInt();
        int t1 = 0 ,t2 = 1, nextTerm = 0;
        if( n == 0){
            System.out.println("Fibonachi Series ::" + " " + t1);
        }else{
            System.out.println( t1 + " " + t2);
            nextTerm = t1 + t2 ;
            while( nextTerm <= n){
                System.out.println(nextTerm);
                t1 = t2;
                t2 = nextTerm ;
                nextTerm = t1 + t2 ;
            }
        }
        sc.close();
        return;
    }
}
