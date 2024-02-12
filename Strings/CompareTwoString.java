package Strings;

public class CompareTwoString {
    public static void main(String[] args) {
        String firstName = "Atul";
        String secondName = "Atul";
        String fullName = firstName +" "+ secondName;
        System.out.println(fullName);
        //Compare two string

        //a > b than its provide (+)positive 
        // a == b than its give 0
        // a < b than its give (-)nigative 
        if(firstName.compareTo(secondName) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
