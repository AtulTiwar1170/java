package Function;
import java.util.*;
public class RecogniseCharacter {
    public static void character(char ch) {
        if(Character.isUpperCase(ch)){
            System.out.println("This is upper case letter::");
        }else if(Character.isLowerCase(ch)){
            System.out.println("This is Lowercase character::");
        }else if(Character.isDigit(ch)){
            System.out.println("This is a Digit");
        }else{
            System.out.println("This is a Special Character");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char chr = sc.next().charAt(0);
        character(chr);
        sc.close();
    }
}