//https://leetcode.cn/problems/unique-number-of-occurrences/submissions/698219938/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int [] a = new int [2002];

        for(int i = 0;i < arr.length;i++)
        {
            a[arr[i] + 1000]++;
        }
        Map<Integer,Integer>mp = new HashMap<>();
        for(int i = 0;i < a.length;i++)
        {
            if(a[i] != 0)
            {
                mp.put(a[i],mp.getOrDefault(a[i],0) + 1);
                if(mp.get(a[i]) > 1)
                {
                    return false;
                }
            }
        }
        return true;
    }
}