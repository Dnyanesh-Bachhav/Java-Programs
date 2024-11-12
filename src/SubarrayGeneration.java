public class SubarrayGeneration {
    public static void main(String[] args) {
        int arr1[] = new int[]{1,2,3,4,5,6,7};
        int n = arr1.length;
        for (int i=0;i<n;i++)
        {
            for (int j=i;j<n;j++)
            {
                for (int k=i;k<=j;k++)
                {
                    System.out.print(arr1[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
