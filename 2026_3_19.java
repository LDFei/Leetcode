//https://leetcode.cn/problems/successful-pairs-of-spells-and-potions/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int [] ans = new int [spells.length];
        for(int i = 0;i < spells.length;i ++)
        {
            ans[i] = tool(spells[i],potions,success) - 1;
        }
        return ans;
    }

    public int tool(int val,int [] potions,long success)
    {
        int l = 0,r = potions.length - 1;
        int ans = 0;
        while(l <= r)
        {
            int mid = l + (r - l) / 2;
            if((long)val * potions[mid] < success)
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }
        return potions.length - r;
    }
}