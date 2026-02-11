//https://leetcode.cn/problems/longest-subarray-of-1s-after-deleting-one-element/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        int l = 0;
        int k = 0;
        for(int i = 0;i < nums.length;i ++)
        {
            if(nums[i] == 0)
            {
                k ++;
            }
            while(k > 1)
            {
                if(nums[l] == 0)
                {
                    k--;
                }
                l ++;
            }
            ans = Math.max(ans, i - l);
        }
        return ans;
    }
}