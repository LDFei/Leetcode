//https://leetcode.cn/problems/unique-paths/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int uniquePaths(int m, int n) {
        int [][] f = new int [m + 1][n + 1];
        f[0][1] = 1;
        for(int i = 0;i < m;i ++)
            for(int j = 0;j < n;j ++)
            {
                f[i + 1][j + 1] = f[i][j + 1] + f[i + 1][j] ;
            }
        return f[m][n];
    }
}