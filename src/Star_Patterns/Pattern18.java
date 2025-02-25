package Star_Patterns;
/*
STRIVER Pattern 18:

E
DE
CDE
BCDE
ABCDE

* * */
public class Pattern18 {
    public static void main(String args[])
    {
        int ROWS = 10;
        int COLS = 5;
        for(int i=0;i<ROWS;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(65+ROWS-j-1));
            }
            System.out.println();
        }
    }
}
