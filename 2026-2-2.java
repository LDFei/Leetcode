//https://leetcode.cn/problems/string-compression/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            int cnt = 0;
            while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                cnt++;
                i++;
            }
            if (cnt != 0) {
                sb.append(chars[i]).append(cnt + 1);
            } else {
                sb.append(chars[i]);
            }
        }
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.toString().charAt(i);
        }
        return sb.length();
    }
}