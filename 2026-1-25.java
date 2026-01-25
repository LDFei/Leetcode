//https://leetcode.cn/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int ans = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            //判断当前位置能否种花
            //能种花的情况
            if (flowerbed[i] == 0
                    && (i + 1 == flowerbed.length || flowerbed[i + 1] == 0)
                    && (i == 0 || flowerbed[i - 1] == 0)) {
                flowerbed[i] = 1;
                ans++;
            }
        }
        return ans >= n;
    }
}