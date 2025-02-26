package Star_Patterns;
/*
STRIVER Pattern 21:

****
*  *
*  *
****

*/

public class Pattern21 {
    public static void main(String args[])
    {
        int ROWS = 5;
        int COLS = 5;
        for(int i=0;i<ROWS;i++)
        {
            for(int j=0;j<COLS;j++)
            {
                if(i==0 || i==ROWS-1)
                {
                    System.out.print("*");
                    continue;
                }
                else if(j==0||j==COLS-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
