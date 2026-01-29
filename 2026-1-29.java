//https://leetcode.cn/problems/product-of-array-except-self/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre_arr = new int[n + 1];

        int[] bg_arr = new int[n + 1];
        pre_arr[0] = 1;
        bg_arr[n - 1] = 1;
        for(int i = 0;i < n;i ++)
        {
            pre_arr[i + 1] = pre_arr[i] * nums[i];
        }
        for(int i = n - 1;i > 0;i --)
        {
            bg_arr[i -  1] = bg_arr[i] * nums[i];
        }
        int [] ans = new int [n];
        for(int i = 0;i < n;i ++)
        {
            ans[i] = pre_arr[i] * bg_arr[i];
        }
        return ans;
    }
}