package Star_Patterns;
/*
STRIVER Pattern 1:

*****
*****
*****
*****
*****

* * */
public class Pattern1{
    public static void main(String[] args) {
        System.out.println("Hello World...!!!");
        int rows = 5;
        int cols = 5;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}