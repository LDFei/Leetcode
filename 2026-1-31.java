//https://leetcode.cn/problems/maximum-average-subarray-i/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int a = 0;
        int ans = -Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i++)
        {
            if(i < k)
            {
                a += nums[i];
            }
            else
            {
                ans = Math.max(ans,a);
                a -= nums[i - k];
                a += nums[i];
            }
        }
        ans = Math.max(ans,a);
        return (double)ans / k;
    }
}