//https://leetcode.cn/problems/reverse-linked-list/?envType=study-plan-v2&envId=leetcode-75
//反转链表，递归写法
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}

//反转链表，迭代写法
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null)
        {
            ListNode m = cur.next;
            cur.next = pre;
            pre = cur;
            cur = m;
        }
        return pre;
    }
}