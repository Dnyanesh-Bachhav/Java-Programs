package Bit_Manipulation;

public class CountOnes {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        while(n>0)
        {
            n = n&(n-1);
            count++;
        }
//        return count;
        System.out.println("No. of ones: "+count);
    }
}
