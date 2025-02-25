package Star_Patterns;

/*
STRIVER Pattern 10:

*
**
***
****
*****
****
***
**
*

* * */
public class Pattern10 {
    public static void main(String args[])
    {
        int rows = 5;
        int cols = 5;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<rows-1;i++)
        {
            for(int j=0;j<cols-i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
