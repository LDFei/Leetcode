//https://leetcode.cn/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75

//力扣75题第三题
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int mx = -1;
        int n = candies.length;
        for(int i = 0;i < candies.length;i++)
        {
            mx = Math.max(mx,candies[i]);
        }
        List<Boolean >ans = new ArrayList<>();
        for(int i = 0;i < candies.length;i++)
        {
            if(candies[i] + extraCandies >= mx)
            {
                ans.add(true);
            }
            else
            {
                ans.add(false);
            }
        }
        return ans;
    }
}