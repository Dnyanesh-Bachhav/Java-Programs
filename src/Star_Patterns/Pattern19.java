package Star_Patterns;
/*

STRIVER Pattern 16:

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********


*/
public class Pattern19 {
    public static void main(String args[])
    {
        System.out.println("Hii");
        int ROWS = 5;
        int COLS = 5;
        //
        for(int i=0;i<ROWS;i++)
        {
            for(int j=0;j<COLS*2;j++)
            {
                if(j<COLS-i || j>=COLS+i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=0;i<ROWS;i++)
        {
            for(int j=0;j<COLS*2;j++)
            {
                if(j<=i || j>=COLS*2-i-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
