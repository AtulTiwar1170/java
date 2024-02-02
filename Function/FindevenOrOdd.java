package Function;
import java.util.*
;public class FindevenOrOdd {
    public static void evenOdd(int num){
        if(num % 2 == 0 ){
            System.out.println("This is even number::");
        }else{
            System.out.println("This is Odd number::");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        evenOdd(firstNumber);
        sc.close();
    }
}
