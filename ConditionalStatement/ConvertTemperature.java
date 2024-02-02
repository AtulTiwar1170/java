package ConditionalStatement;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args){
        // convert temperature celcius into fahrenheit
        Scanner sc = new Scanner(System.in);
        int celcius = sc.nextInt();
        int fahrenheit = (9/5*celcius)+32;
        System.out.println("Temperature in fahrenheit"+fahrenheit);
        sc.close();
        //complete
    }
}
