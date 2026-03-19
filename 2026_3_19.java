//https://leetcode.cn/problems/successful-pairs-of-spells-and-potions/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            spells[i] = potions.length - lowerBound(potions, (double) success / spells[i]);
        }
        return spells;
    }

    // 返回 nums 中的第一个大于等于 target 的元素下标
    private int lowerBound(int[] nums, double target) {
        int left = -1, right = nums.length; // 开区间 (left, right)
        while (left + 1 < right) { // 区间不为空
            // 循环不变量：
            // nums[left] <= target
            // nums[right] > target
            int mid = (left + right) >>> 1; // 比 left+(right-left)/2 更快的写法
            if (nums[mid] >= target) {
                right = mid; // 二分范围缩小到 (left, mid)
            } else {
                left = mid; // 二分范围缩小到 (mid, right)
            }
        }
        return right;
    }

}