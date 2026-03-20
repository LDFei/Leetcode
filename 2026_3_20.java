//https://leetcode.cn/problems/koko-eating-bananas/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1,r = -1;
        for(var i : piles)
        {
            r = Math.max(r,i);
        }
        int ans = -1;
        while(l <= r)
        {
            int mid = l + (r - l) / 2;
            long val = 0;
            for(var i : piles)
            {
                val += (i + mid - 1)/mid;
            }
            if(val > h)
            {
                l = mid + 1;
            }
            else
            {
                ans = mid;
                r = mid - 1;
            }
        }
        return ans;
    }
}