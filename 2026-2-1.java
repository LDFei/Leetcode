//https://leetcode.cn/problems/increasing-triplet-subsequence/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int ax = Integer.MAX_VALUE;
        int mi = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= ax) {//记录最小的
                ax = nums[i];
            } else if (nums[i] <= mi) {//记录比最小的大一点的
                mi = nums[i];
            } else
                return true;//如果直接比第mi大的还大，那么就返回true
        }
        return false;
    }
}