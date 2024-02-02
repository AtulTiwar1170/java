package ConditionalStatement;
import java.util.*;
public class FindVowelOrConsonent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char checkAlphabets = sc.next().charAt(0);
        if(checkAlphabets == 'A' || checkAlphabets =='E' || checkAlphabets == 'I' || checkAlphabets == 'O' || checkAlphabets == 'U'){
            System.out.print("This is vowel");
        }else if (checkAlphabets == 'a' || checkAlphabets == 'e' || checkAlphabets == 'i' || checkAlphabets == 'o' || checkAlphabets == 'u'){
            System.out.print("This is vowel");
        }else{
            System.out.print("This Consonent");
        }
        sc.close();
    }
}
//complete