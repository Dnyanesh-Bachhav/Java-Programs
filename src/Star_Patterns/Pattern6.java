package Star_Patterns;
/*
STRIVER Pattern 6:

12345
1234
123
12
1

* * */
public class Pattern6 {
    public static void main(String args[])
    {
        int rows = 5;
        int cols = 5;
        for(int i=0;i<rows;i++)
        {
            for(int j=1;j<=cols-i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
