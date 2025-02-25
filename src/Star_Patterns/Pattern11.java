package Star_Patterns;

/*
STRIVER Pattern 11:

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

* * */
public class Pattern11 {
    public static void main(String args[])
    {
        int rows = 5;
        for(int i=0;i<rows;i++)
        {
            int count = i%2==0 ? 1: 0;
            for(int j=0;j<=i;j++)
            {
                System.out.print(count);
                count = count==1 ? 0 : 1;
            }
            System.out.println();
        }
    }
}