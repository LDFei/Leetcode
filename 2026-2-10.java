//https://leetcode.cn/problems/determine-if-two-strings-are-close/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int arr1 [] = new int [26];
        int arr2 [] = new int [26];
        char a [] = word1.toCharArray();
        char b [] = word2.toCharArray();
        for(int i = 0;i < a.length;i ++)
        {
            arr1[a[i] - 'a'] ++;
        }
        for(int i = 0;i < b.length;i ++)
        {
            arr2[b[i] - 'a'] ++;
        }
        for(int i = 0;i < arr1.length;i++)
        {
            if(arr1[i] > 0 && arr2[i] == 0)
            {
                return false;
            }
            if(arr2[i] > 0 && arr1[i] == 0)
            {
                return false;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0;i < arr1.length;i ++ )
        {
            if(arr1[i] != arr2[i])
            {
                return false;
            }
        }
        return true;
    }
}