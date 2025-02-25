package Maths;

public class ArmStrong {
    public static void main(String[] args) {
        int num = 153;
        int n = 0;
        int temp1 = 0;
        int temp = num;
        while (temp > 0){
            n++;
            temp /= 10;
        }
        temp = num;
        while(temp>0)
        {
            int lastDigit = temp%10;
            temp1 += Math.pow(lastDigit, n);
            temp /= 10;
        }

        System.out.println(temp1+" "+ num);
        if(temp1==num)
        {
            System.out.println("It is an armstrong number");
        }
        else{
            System.out.println("It is not an armstrong number");
        }
    }
}
