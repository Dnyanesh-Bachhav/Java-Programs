/*
You will be given array nums and k, find maximum sum of consecutive subArray, you can pick elements from
either the front or back of the array.
Elements should be never be chosen by center.

Refer Video: https://youtu.be/pBWCOCS636U?si=ZMFdAi_UeXJ583q6
*/
public class SlidingWindow1 {
    public static void main(String[] args) {
        System.out.println("Hello World...!!!");
        int nums[] = {1,42,5,6,2,5,7,10,12};
        int k = 4;
        int lSum = 0;
        int rSum = 0;
        int maxSum = 0;
//      Calculate sum of elements in array
        for(int i=0;i<k;i++)
        {
            lSum+=nums[i];
        }
        maxSum = lSum;
        int rIndex = nums.length-1;
        for(int i=k-1;k>=0;k--)
        {
            lSum = lSum - nums[i];
            rSum = rSum + nums[rIndex];
            rIndex--;
            maxSum = Math.max(maxSum,lSum+rSum);
        }
        System.out.println("MaxSum: "+maxSum);
    }
}
