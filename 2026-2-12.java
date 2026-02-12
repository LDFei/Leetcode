//https://leetcode.cn/problems/max-consecutive-ones-iii/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int ans = 0;
        int m = 0;
        for(int r = 0;r < nums.length;r ++)
        {
            if(nums[r] == 0)
            {
                m ++;
            }
            while(m > k)
            {
                if(nums[l] == 0)
                {
                    m--;
                }
                l++;
            }
            ans = Math.max(ans,r - l + 1);
        }
        return ans;
    }
}