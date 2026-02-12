//https://leetcode.cn/problems/find-the-highest-altitude/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int a [] = new int [n + 1];
        int ans = 0;
        for(int i = 0;i < n;i ++ )
        {
            a[i + 1] = a[i] + gain[i];
            ans = Math.max(ans,a[i + 1]);
        }
        return ans;
    }
}