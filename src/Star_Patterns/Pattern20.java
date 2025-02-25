package Star_Patterns;
/*
STRIVER Pattern 20:

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/

public class Pattern20 {
    public static void main(String args[])
    {
        System.out.println("Hello World...!!!");
        int ROWS = 5;
        int COLS = 5;
        for(int i=0;i<ROWS;i++)
        {
            for(int j=0;j<COLS*2;j++)
            {
                if(j<=i || j>=COLS*2-i-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=ROWS-1;i>=0;i--)
        {
            for(int j=1;j<=COLS*2;j++)
            {
                if(j<=i || j>COLS*2-i)
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
