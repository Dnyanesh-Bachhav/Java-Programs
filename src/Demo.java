import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        String str = "Demo";
        int ch = str.charAt(0);
        System.out.println(ch);
        Solution s = new Solution();
        s.hasIncreasingSubarrays(new ArrayList<Integer>(Arrays.asList(5,8,-2,-1)), 2);
    }
}
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int left = 0;
        int right = 0;
        boolean doExist = false;
        if(nums.size()<2*k)
        {
            return false;
        }
        if (k == 1) {
            return true;
        }
        for(int i=0;i<=nums.size()-2*k;i++)
        {
            boolean isIncreasing = true;
            for(int j=i;j<i+k-1;j++)
            {
                if(nums.get(j)>=nums.get(j+1))
                {
                    isIncreasing = false;
                    break;
                }
            }
            if(!isIncreasing)
            {
                continue;
            }
            boolean isSecondIncreasing = true;
            for(int j=i+k;j<i+k+k-1;j++)
            {
                if(nums.get(j)>=nums.get(j+1))
                {
                    isSecondIncreasing = false;
                    break;
                }
            }
            if(isSecondIncreasing)
            {
                return true;
            }
        }
        return false;
    }
}