//https://leetcode.cn/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public boolean isSubsequence(String s, String t) {
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();
        int i = 0;
        int j = 0;
        int ans = 0;
        while(i < b.length && j < a.length)
        {

            if(a[j] == b[i])
            {
                j ++;
                ans ++;
            }
            i++;
        }
        return ans >= a.length;
    }
}