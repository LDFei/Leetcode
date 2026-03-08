//https://leetcode.cn/problems/n-th-tribonacci-number/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int tribonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        if(n == 0)
        {
            return 0;
        }
        if(n > 0 && n < 3)
        {
            return 1;
        }
        int ans = 0;
        for(int i = 0;i < n - 2;i ++ )
        {
            ans = a + b + c;
            a = b;
            b = c;
            c = ans;
        }
        return ans;
    }
}

