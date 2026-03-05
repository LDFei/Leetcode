//https://leetcode.cn/problems/leaf-similar-trees/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        tool(a,root1);
        tool(b,root2);

        return a.equals(b);
    }

    public void tool(List<Integer> a,TreeNode t)
    {
        if(t == null)
        {
            return;
        }
        if(t.left == null && t.right == null)
        {
            a.add(t.val);
        }

        tool(a,t.left);
        tool(a,t.right);
    }
}