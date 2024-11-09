public class CountDigit {
    public static void main(String args[])
    {
        int num = 123;
        int count = 0;
        while(num!=0)
        {
            num = num/10;
//            System.out.println(num);
            count++;
        }
        System.out.println("Number of digits in a number are "+count);
//        Way 2:
        int num1 = 12300;
        int cnt = (int)(Math.log10(num1)+1);
        System.out.println("Way 2: "+cnt);
    }
}
