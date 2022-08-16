package com.jlutripper.leetcode.everyday.MyCircularQueue;

import com.jlutripper.leetcode.tools.ListNode;

/**
 * @ClassName: MyLinkListCircularDeque
 * @Auther: Jlutripper
 * @Date: 2022/8/15 13:50
 */

public class MyLinkListCircularDeque implements MyCircularDeque{

    private int size;
    private final int capacity;
    private ListNode head,tail;


    public MyLinkListCircularDeque(int k) {
        this.capacity = k;
        this.size = 0;
    }

    @Override
    public boolean enQueue(int value) {
        if(isFull()) return false;
        ListNode node = new ListNode(value);
        if(this.size==0) head = tail = node;
        else {
            tail.next = node;
            tail = tail.next;
        }
        this.size++;
        return true;
    }

    @Override
    public boolean deQueue() {
        if(isEmpty()) return false;
        head = head.next;
        if(this.size==1) tail = null;
        size--;
        return true;
    }

    @Override
    public int Front() {
        return this.isEmpty() ? this.head.val : -1;
    }

    @Override
    public int Rear() {
        return this.isEmpty() ? this.tail.val : -1;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean isFull() {
        return this.size == this.capacity;
    }
}


