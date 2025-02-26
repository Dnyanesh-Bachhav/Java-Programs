package Star_Patterns;

public class Pattern22 {
    public static void main(String args[])
    {
        int ROWS = 5;
        int COLS = 5;
        int N = 4;
        for(int i=0;i<2*N-1;i++)
        {
            for(int j=0;j<2*N-1;j++)
            {
                int top = i;
                int bottom = j;
                int right = (2*N-2)-j;
                int left = (2*N-2)-i;

                int num = N - Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(num);
            }
            System.out.println();
        }
    }
}