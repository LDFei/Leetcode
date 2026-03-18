//https://leetcode.cn/problems/kth-largest-element-in-an-array/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int m = n - k;
        int l = 0;
        int r = n - 1;
        while(true)
        {
            int flag = tool(nums,l,r);
            if(flag == m)
            {
                return nums[flag];
            }
            if(flag > m)
            {
                r = flag - 1;
            }
            else
            {
                l = flag + 1;
            }
        }

    }
    private int tool(int [] nums,int l,int r)
    {
        int i = l + (r - l) / 2;

        int p = nums[i];
        swap(nums,l,i);
        i = l + 1;
        int j = r;
        while(true)
        {
            while(i <= j && nums[i] < p)
            {
                i ++;
            }
            while(i <= j && nums[j] > p)
            {
                j --;
            }
            if(i > j)
            {
                break;
            }
            swap(nums,i,j);
            i++;
            j--;
        }
        swap(nums,l,j);
        return j;
    }
    private void swap(int [] nums,int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}