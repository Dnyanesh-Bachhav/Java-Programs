package Maths;

public class GCD {
    static int getGcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        return getGcd(b, a%b);
    }
    public static void main(String args[]){
        int a  = 2, b = 10;
        System.out.println(getGcd(a,b));

    }
}
