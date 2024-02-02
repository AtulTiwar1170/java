package ConditionalStatement;
import java.util.*;
public class FindEquilateralIsoscelesScalaentriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sideFirst = sc.nextInt();
        int sideSecond = sc.nextInt();
        int sideThird = sc.nextInt();

        if(sideFirst == sideSecond && sideSecond == sideThird ){
            System.out.print("This is Equilateral Triangle::");
        }else if(sideFirst == sideSecond || sideSecond == sideThird || sideFirst == sideThird){
            System.out.println("THis is Isosceles Triangle:");
        }else{
            System.out.println("This is scalen Triangle:");
        }
        sc.close();
        //complete
    }
}
