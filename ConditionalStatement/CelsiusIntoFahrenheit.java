package ConditionalStatement;

import java.util.Scanner;

public class CelsiusIntoFahrenheit {
    public static void main(String[] args){
        // Convert Temperature fahrenheit into celsius
        Scanner sc = new Scanner(System.in);
        int fahrenheit = sc.nextInt();
        int celsius = (fahrenheit-32)*5/9;
        System.out.println(celsius);
        sc.close();
        //complete
    }
}
