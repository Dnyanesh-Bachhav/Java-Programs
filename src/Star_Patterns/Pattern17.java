package Star_Patterns;

public class Pattern17 {
    public static void main(String args[])
    {
        int ROWS = 4;
        int COLS = 4;
        for(int i=0;i<ROWS;i++)
        {
            int count = 0;
            boolean isFirst = true;
            for(int j=0;j<COLS*2-1;j++)
            {
                if(j>=COLS-i-1 && j<ROWS)
                {
                    System.out.print((char)(65+count++));
                }
                else if(j<=COLS+i-1 && j>=ROWS)
                {
                    if(isFirst)
                    {
                        --count;
                        isFirst = false;
                    }
                    count--;
                    System.out.print((char)(65+ count));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
