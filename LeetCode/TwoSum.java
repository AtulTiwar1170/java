package LeetCode;

public class TwoSum {
    public static void main(String[] args) {
        int target = 9;
        int[] num = {9, 7, 2, 8};
        for(int  i=0; i<num.length; i++ ){
            for(int j=i+1; j<num.length; j++){
                if(num[i]+num[j] == target){
                    System.out.println("Addition of two index values these index number are::");
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}