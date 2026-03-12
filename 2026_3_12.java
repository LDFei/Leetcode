//https://leetcode.cn/problems/binary-tree-right-side-view/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null)
        {
            return list;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int s = q.size();
            Boolean falg = true;
            while(s != 0)
            {
                s --;
                TreeNode t = q.poll();
                if(falg)
                {
                    list.add(t.val);
                    falg = false;
                }
                if(t.right != null)
                    q.add(t.right);

                if(t.left != null)
                    q.add(t.left);
            }
        }
        return list;
    }
}