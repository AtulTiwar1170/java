package ConditionalStatement;

public class SmallestOfThreeNum {
    public static void main(String[] args){
        // find largest and smallest number os three  numbers
        int firstNum = 100;
        int secondNum = 50;
        int thirdNum = 30;
        // find largest of three numbers
        int Largest = Math.max(Math.max(firstNum , secondNum) ,thirdNum);
        // find smallest of three numbers
        int Smallest = Math.min(Math.min(firstNum , secondNum) , thirdNum);
        System.out.println(Largest);
        System.out.println(Smallest);
    }
}
//completed
