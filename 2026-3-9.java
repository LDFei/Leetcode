//https://leetcode.cn/problems/path-sum-iii/submissions/704490517/?envType=study-plan-v2&envId=leetcode-75
 // 前缀和优化：思路是计算目前所有路径和，然后通过路径和减去目标和，去表里查是否存在对应的值，如果存在则有一条路径
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null)
        {
            return 0;
        }
        Map<Long,Integer> mp = new HashMap<>();
        mp.put(0L,1);
        return dfs(root,0,mp,targetSum);
    }
    public int dfs(TreeNode root,long sum,Map<Long,Integer> mp,int targetSum)
    {
        if(root == null)
        {
            return 0;
        }
        int cnt = 0;
        sum += root.val;

        cnt += mp.getOrDefault(sum - targetSum,0);
        mp.put(sum,mp.getOrDefault(sum,0) + 1);


        cnt += dfs(root.left,sum,mp,targetSum);
        cnt += dfs(root.right,sum,mp,targetSum);

        mp.put(sum,mp.getOrDefault(sum,0) - 1);
        return cnt;
    }
}


//暴力：
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null)
        {
            return 0;
        }
        int ans = 0;
        return pathSum(root.left,targetSum) + pathSum(root.right,targetSum) + dfs(root,targetSum);
    }
    public int dfs(TreeNode root,long sum)
    {
        if(root == null)
        {
            return 0;
        }
        int cnt = 0;
        if(root.val == sum)
        {
            cnt ++;
        }
        cnt += dfs(root.left,sum - root.val);
        cnt += dfs(root.right,sum - root.val);
        return cnt;
    }
}