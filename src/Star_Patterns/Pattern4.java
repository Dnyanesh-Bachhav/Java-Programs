package Star_Patterns;
/*
STRIVER Pattern 4:

1
22
333
4444
55555

* * */
public class Pattern4 {
    public static void main(String args[])
    {
        int rows = 5;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
