package Bit_Manipulation;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        // Approach 1:
        /* int num1 = 5, num2 = -10;
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("Num1: "+num1+" Num2:"+num2); */

        // Approach 2:
        int num1 = 10, num2 = 20;
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println(num1+":"+num2);
    }
}
