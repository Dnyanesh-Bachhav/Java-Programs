public class ReverseNumber {
    public static void main(String args[])
    {
        // Way 1
        Integer num = 123;
        StringBuffer str = new StringBuffer(num.toString());
        System.out.print("Way 1: "+str.reverse());
        // Way 2
        int num1 = 123;
        int rev = 0;
        while(num1!=0)
        {
            rev = rev*10+(num1%10);
            num1 = num1/10;
        }
        System.out.println("\nWay 2: "+rev);
    }
}
