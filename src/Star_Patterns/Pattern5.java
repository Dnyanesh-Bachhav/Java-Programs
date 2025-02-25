package Star_Patterns;
/*
STRIVER Pattern 5:

*****
****
***
**
*

* * */
public class Pattern5 {
    public static void main(String args[])
    {
        int rows = 5;
        int cols = 5;
        for(int i=0;i<rows;i++)
        {
            for(int j=cols-i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
