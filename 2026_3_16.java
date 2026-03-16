// https://leetcode.cn/problems/number-of-provinces/submissions/707986042/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    boolean[] vis;
    int ans;
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        vis = new boolean[n];
        ans = 0;

        for(int i = 0;i < n;i ++)
        {
            if(!vis[i])
            {
                ans ++;
                dfs(isConnected,i);
            }
        }
        return ans;
    }
    public void dfs(int[][] isConnected,int i)
    {
        vis[i] = true;

        for(int j = 0;j < isConnected.length;j ++)
        {
            if(isConnected[i][j] == 1 && !vis[j])
            {
                dfs(isConnected,j);
            }
        }
    }
}