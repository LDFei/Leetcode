//https://leetcode.cn/problems/maximum-number-of-vowels-in-a-substring-of-given-length/?envType=study-plan-v2&envId=leetcode-75
//定长的滑动窗口
class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        int m = 0;
        int l = 0,r = 0;
        char [] c = s.toCharArray();
        while(r < c.length)
        {
            if(c[r] == 'a' || c[r] == 'e' || c[r] == 'i' || c[r] == 'o' || c[r] == 'u')
            {
                m ++;
            }
            r ++;
            if(r - l  < k)
            {
                continue;
            }
            ans = Math.max(ans,m);
            if(c[l] == 'a' || c[l] == 'e' || c[l] == 'i' || c[l] == 'o' || c[l] == 'u')
            {
                m--;
            }
            l ++;
        }
        return ans;
    }
}