package com.jlutripper.leetcode.hot100;

import com.jlutripper.leetcode.tools.ListNode;

public class AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int extra = 0;
        ListNode head = new ListNode();
        ListNode cur = head;

        while(l1!=null || l2!=null){
            int sum = extra;
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }

            extra = sum/10;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
        }

        if(extra!=0) cur.next = new ListNode(extra);

        return head.next;

    }
}
