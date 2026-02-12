//https://leetcode.cn/problems/find-pivot-index/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int a [] = new int [n + 1];
        int b [] = new int [n + 1];
        for(int i = 0;i < n;i++)
        {
            a[i + 1] = a[i] + nums[i];
        }
        for(int i = n - 1 ;i >= 0; i--)
        {
            b[i] = b[i + 1] + nums[i];
        }

        for(int i = 0;i < n;i ++)
        {
            if(a[i] == b[i + 1])
            {
                return i;
            }
        }
        return -1;
    }
}