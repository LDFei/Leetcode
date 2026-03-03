//https://leetcode.cn/problems/maximum-twin-sum-of-a-linked-list/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int pairSum(ListNode head) {
        int ans = 0;
        if(head == null || head.next == null)
        {
            return ans;
        }
        Map<Integer,Integer> mp = new HashMap<>();
        ListNode p = head;
        int n = 0;
        while(p != null)
        {
            mp.put(n,p.val);
            p = p.next;
            n ++;
        }
        p = head;

        for(int i = 0;i < n / 2;i ++)
        {
            ans = Math.max(ans,mp.get(i) + mp.get(n - i - 1));
        }
        return ans;
    }
}