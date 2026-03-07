//https://leetcode.cn/problems/search-in-a-binary-search-tree/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val)
        {
            return root;
        }
        if(root.val > val) return searchBST(root.left,val);
        else return searchBST(root.right,val);
    }
}