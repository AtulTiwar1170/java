package ConditionalStatement;
import java.util.*;
public class StreamAlloted {
    public static void main(String[] args){
        /*Write a Python program to accept the marks of English, Math, and Science, Social Studies Subject and display the stream allotted according to the following conditions:
All Subjects more than 80 marks — Science Stream
English >80 and Math, Science above 50 — Commerce Stream
English > 80 and Social studies > 80 — Humanitie */
        Scanner sc = new Scanner(System.in);
        float English = sc.nextFloat();
        float Math = sc.nextFloat();
        float Science = sc.nextFloat();
        float socialStudies = sc.nextFloat();
        if( English >= 80 && Math >= 80 && Science >= 80 && socialStudies >= 80){
            System.out.print("Science Stream alloted to you::");
        }else if( English >= 80 && Math >= 50 && Science >= 50){
            System.out.print("Commerce Stream alloted to you::");
        }else if( English >= 80 && socialStudies >= 80){
            System.out.print("Humanitie Stream alloted to you");
        }else{
            System.out.print("Sorry , you are jus pass we don't provide any stream::");
        }
        sc.close();
        //complete
    }
}
