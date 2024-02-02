package ConditionalStatement;

public class DivisibleBy7andMultipleOf5 {
    public static void main(String[] args){
        for(int i =1500 ; i <= 2700 ; i++){
            if( i%7==0 && i % 5==0){
                System.out.println(i);
                //complete
            }
        }
    }
}
