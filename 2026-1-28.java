//https://leetcode.cn/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String reverseWords(String s) {

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        char[] chars = s.toCharArray();
        int n = chars.length;

        for (int i = n - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                a.append(chars[i]);
            } else {
                if (a.length() > 0) {
                    b.append(tool(a.toString()));
                    b.append(" ");
                    a.setLength(0); // 清空 StringBuilder
                }
            }
        }

        // 处理最后一个单词（如果字符串开头没有空格）
        if (a.length() > 0) {
            b.append(tool(a.toString()));
        }

        return b.toString().trim();
    }

    String tool(String a) {
        StringBuilder b = new StringBuilder();
        char[] chars = a.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            b.append(chars[i]);
        }
        return b.toString();
    }
}