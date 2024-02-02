package Operater;

import java.util.Scanner;

public class ArithmaticOperater {
    public static void main(String[] args){
        //Arithmatic Operater +,-,*,/,%
        Scanner sc = new Scanner(System.in);
        int valueFirst = sc.nextInt();
        int valueSecond = sc.nextInt();
        System.out.println("Addition operater =" + " " +(valueFirst + valueSecond)); //Addition operater
        System.out.println("Subtraction operater =" + " " +  (valueFirst - valueSecond)); //subtraction operater
        System.out.println("Multiplication operater =" + " " +(valueFirst * valueSecond)); //multiplication operater
        System.out.println("Division operater =" + " " +(valueFirst / valueSecond)); //Division operater
        System.out.println("Modulo operater =" + " " +(valueFirst % valueSecond)); //Modulo operater
        sc.close();
    }
}
