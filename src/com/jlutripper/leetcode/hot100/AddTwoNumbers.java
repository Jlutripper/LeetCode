package com.jlutripper.leetcode.hot100;

import com.jlutripper.leetcode.tools.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, cur = null;
        int next = 0;
        while(l1!=null || l2!=null){
            int n1 = l1!=null ? l1.val : 0;
            int n2 = l2!=null ? l2.val : 0;
            int sum = n1 + n2 + next;
            next = sum / 10;
            sum %= 10;
            if(head==null) head = cur = new ListNode(sum);
            else{
                cur.next = new ListNode(sum);
                cur = cur.next;
            }
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(next!=0) cur.next = new ListNode(next);
        return head;
    }
}
