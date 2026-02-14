//https://leetcode.cn/problems/removing-stars-from-a-string/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public String removeStars(String s) {
        List<Character> a = new ArrayList<>();
        char c [] = s.toCharArray();
        for(int i = 0;i < c.length;i ++)
        {
            if(c[i] != '*')
            {
                a.add(c[i]);
            }
            else
            {
                a.removeLast();
            }
        }
        StringBuilder ss = new StringBuilder();
        for(int i = 0;i < a.size();i++)
        {
            ss.append(a.get(i));
        }

        return ss.toString();
    }
}