//https://leetcode.cn/problems/longest-zigzag-path-in-a-binary-tree/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    int maxpath = 0;
    public int longestZigZag(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        tool(root.left,0,1);
        tool(root.right,1,1);
        return maxpath;
    }
    public void tool(TreeNode root,int a,int length)
    {
        if(root == null)
        {
            return;
        }
        maxpath = Math.max(maxpath,length);
        if(a == 0)
        {
            tool(root.right,1,length + 1);
            tool(root.left,0,1);
        }
        else
        {
            tool(root.left,0,length + 1);
            tool(root.right,1,1);
        }
    }
}