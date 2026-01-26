//https://leetcode.cn/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length() - 1;
        char [] a = s.toCharArray();
        Set<Character>mp = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        while(l < r)
        {
            if(!mp.contains(a[l]))
            {
                l++;
            }
            else if(!mp.contains(a[r]))
            {
                r--;
            }
            else
            {
                char b = a[l];
                a[l] = a[r];
                a[r] = b;
                l ++;
                r --;
            }
        }
        return new String(a);
    }
}