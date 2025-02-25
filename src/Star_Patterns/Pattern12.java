package Star_Patterns;
/*
STRIVER Pattern 12:

1      1
12    21
123  321
12344321

* * */

public class Pattern12 {
    public static void main(String[] args) {
        int ROWS = 4;
        int COLS = 4;
        for(int i=0;i<ROWS;i++)
        {
            int count = 1;
            for(int j=0;j<COLS*2;j++)
            {
                if(j<=i)
                {
                    System.out.print(count++);
                }
                else if(j>=COLS*2-i-1)
                {
                    System.out.print(--count);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}