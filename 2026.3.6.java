//https://leetcode.cn/problems/count-good-nodes-in-binary-tree/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int goodNodes(TreeNode root) {
        return tool(root,root.val);
    }
    public int tool(TreeNode root,int m)
    {
        if(root == null)
        {
            return 0;
        }
        int ans = 0;
        if(root.val >= m)
        {
            ans ++;
        }
        int val = Math.max(m,root.val);
        ans += tool(root.left,val);
        ans += tool(root.right,val);
        return ans;
    }
}