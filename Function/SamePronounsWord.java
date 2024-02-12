package Function;
import java.util.*;
public class SamePronounsWord {
    public static void samePronounsWords(String str){
        String result = "";
        for(int i = 0; i <= str.length(); i++){
            char ch = str.charAt(i);
            if( ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                result = result + ch + "" + ch + "" + ch;
            }else if(ch =='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                result = result + ch + "" + ch + "" + ch;
            }else{
                result = result + ch + "" + ch;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        samePronounsWords(str);
        sc.close();
    }
}
//Explanation
