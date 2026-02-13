//https://leetcode.cn/problems/equal-row-and-column-pairs/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int equalPairs(int[][] grid) {
        int h = grid.length;
        int a [][] = new int [h][h];
        int ans = 0;
        for(int i = 0;i < h;i ++)
        {
            for(int j = 0;j < h;j ++)
            {
                a[i][j] = grid[j][i];
            }
        }
        for(int i = 0;i < h;i ++)
        {
            for(int j = 0;j < h;j ++)
            {
                if(Arrays.equals(a[i], grid[j]))
                    ans++;
            }

        }
        return ans;
    }
}