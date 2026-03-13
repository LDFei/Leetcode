//https://leetcode.cn/problems/maximum-level-sum-of-a-binary-tree/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int n = 0;
        int ans = -Integer.MAX_VALUE;
        int ans_end = 0;
        while(!q.isEmpty())
        {
            int sum = 0;
            n ++;
            int s = q.size();
            while(s > 0)
            {
                s --;
                TreeNode m = q.poll();
                sum += m.val;
                if(m.left != null)
                {
                    q.add(m.left);
                }
                if(m.right != null)
                {
                    q.add(m.right);
                }
            }
            if(sum > ans)
            {
                ans_end = n;
                ans = sum;
            }

        }
        return ans_end;
    }
}