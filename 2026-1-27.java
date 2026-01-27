//https://leetcode.cn/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0,r = 0;

        while(l < nums.length && r < nums.length)
        {
            if(nums[l] != 0)
            {
                l ++;
                r ++;
            }
            else if(nums[r] == 0)
            {
                r ++;
            }
            else if(nums[l] == 0 && nums[r] != 0)
            {
                int a = nums[l];
                nums[l] = nums[r];
                nums[r] = a;
                l ++;
                r ++;
            }
        }
        return;
    }
}


//更简洁的代码：
class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        for(int i = 0;i < nums.length;i ++)
        {
            if(nums[i] != 0)
            {
                int a = nums[i];
                nums[i] = nums[l];
                nums[l] = a;
                l ++;
            }
        }
    }
}