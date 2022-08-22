package com.jlutripper.leetcode.ds.linkedlist;

import com.jlutripper.leetcode.tools.ListNode;

/**
 * @ClassName: IsPalindrome
 * @Description: 剑指 Offer II 027. 回文链表
 * @Auther: Jlutripper
 * @Date: 2022/8/16 14:59
 */

public class IsPalindrome {
    /**
     * @Description: 给出头节点，判断链表是否为回文
     * @Param: [head]
     * @return: boolean
     * @Author: Jlutripper
     * @Date: 2022/8/16
     */
    public boolean isPalindrome(ListNode head) {
        StringBuffer sb = new StringBuffer();
        while(head!=null){
            sb.append(head.val);
            head = head.next;
        }
        String a = sb.toString();
        String b = sb.reverse().toString();
        return a.equals(b);

    }
}


