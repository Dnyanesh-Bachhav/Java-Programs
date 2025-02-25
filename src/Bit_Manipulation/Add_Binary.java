package Bit_Manipulation;

class Add_Binary {
    public static String addBinary(String a, String b) {
        // Approach 1:
        /* long a1 = Long.parseLong(a,2);
        long b1 = Long.parseLong(b,2);
        return Long.toBinaryString(a1+b1);
        */

            // Approach 2:
            int index1 = a.length()-1;
            int index2 = b.length()-1;
            int carry = 0;
            String s ="";
            while(index1>=0||index2>=0||carry==1)
            {
                // int sum = 0;
                if(index1>=0)
                {
                    carry += a.charAt(index1--)-'0';
                }
                if(index2>=0)
                 {
                    carry += b.charAt(index2--)-'0';
                }
                s += (carry%2);
                System.out.print(carry%2);
                carry /= 2;
            }
            return new StringBuilder(s).reverse().toString();

    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        addBinary(a,b);
    }
}