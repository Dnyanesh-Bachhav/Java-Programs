package Star_Patterns;
/*
STRIVER Pattern 9:
       *
      ***
     *****
    *******
   *********
   *********
    *******
     *****
      ***
       *
* * */
public class Pattern9 {
    public static void main(String args[])
    {
        int rows = 5;
        int cols = 5;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols*2;j++)
            {
                if(j>=cols-i-1 && j<=cols+i-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols*2;j++)
            {
                if(j>=i && j<cols*2-i-1)
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
