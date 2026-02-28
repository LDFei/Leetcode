//https://leetcode.cn/problems/delete-the-middle-node-of-a-linked-list/submissions/701137051/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
        {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = null;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }
        pre.next = slow.next;
        slow.next = null;
        return head;
    }
}