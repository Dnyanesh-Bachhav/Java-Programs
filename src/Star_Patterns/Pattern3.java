package Star_Patterns;
/*
STRIVER Pattern 3:

1
12
123
1234
12345

* * */
public class Pattern3 {
    public static void main(String args[]){
        int rows = 5;
        int cols = 5;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}