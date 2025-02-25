package Star_Patterns;
/*
STRIVER Pattern 15:

ABCDE
ABCD
ABC
AB
A
* * */

public class Pattern15 {
    public static void main(String args[])
    {
        int ROWS = 4;
        int COLS = 5;
        for(int i=0;i<=ROWS;i++)
        {
            for(int j=0;j<COLS-i;j++)
            {
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }
}
