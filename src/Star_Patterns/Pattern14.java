package Star_Patterns;
/*
STRIVER Pattern 14:

A
AB
ABC
ABCD
ABCDE

* * */
public class Pattern14 {
    public static void main(String args[])
    {
        int ROWS = 5;
        int COLS = 5;
        for(int i=0;i<ROWS;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }
}
