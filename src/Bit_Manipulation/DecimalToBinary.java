package Bit_Manipulation;

public class DecimalToBinary {
    static String convertDecimalToBinary(int num)
    {
        String ans = "";
        while(num>0)
        {
            ans += num%2;
            num = num/2;
        }
        return new StringBuilder(ans).reverse().toString();
    }
    public static void main(String[] args) {
        int num = 12;
        System.out.println(num);
        System.out.println(convertDecimalToBinary(num));
    }
}
