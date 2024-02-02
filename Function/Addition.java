package Function;
import java.util.*;
public class Addition {
    public static void addition(int num1 , int num2){
        int result = num1 + num2 ;
        System.out.println(result);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        addition(firstNumber, secondNumber);
        sc.close();
    }
}
