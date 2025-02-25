package Recursion;

import java.util.Scanner;

/*
* Print N to 1
* Do not use n-1
* */
public class PrintNTo1 {
    static void print(int stop, int num)
    {
        if(num > stop){
            return;
        }
        print(stop, num+1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stop = sc.nextInt();
        print(stop, 1);
    }
}

