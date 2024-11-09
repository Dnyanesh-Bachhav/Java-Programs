public class Printalldivisors {
    public static void main(String[] args) {
//        Approach 1:
        int num = 64;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println("Divisor: "+i);
            }
        }
//        Approach 2:
        int num1 = 64;
        int limit = (int)(Math.sqrt(num1));
        for(int i=1;i<=limit;i++)
        {
            System.out.println("Divisor: "+i);
        }

    }
}
