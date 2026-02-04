//https://leetcode.cn/problems/max-number-of-k-sum-pairs/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int maxOperations(int[] nums, int k) {
        int ans = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i < nums.length;i++)
        {
            if(mp.getOrDefault(k - nums[i],0) > 0)
            {
                ans += 1;
                mp.put(k - nums[i],mp.getOrDefault(k - nums[i],0) - 1);
                continue;
            }
            mp.put(nums[i],mp.getOrDefault(nums[i],0) + 1);
        }
        return ans;
    }
}