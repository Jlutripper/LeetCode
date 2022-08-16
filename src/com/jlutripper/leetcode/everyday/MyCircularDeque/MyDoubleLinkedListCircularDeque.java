package com.jlutripper.leetcode.everyday.MyCircularDeque;

import com.jlutripper.leetcode.tools.DoubleLinkedNode;
import com.jlutripper.leetcode.tools.ListNode;

/**
 * @ClassName: MyLinkedListCircularDeque
 * @Description:
 * @Auther: Jlutripper
 * @Date: 2022/8/16 14:49
 */

public class MyDoubleLinkedListCircularDeque implements MyCircularDeque {

    int size, capacity;

    DoubleLinkedNode front, rear;

    public MyDoubleLinkedListCircularDeque(int k) {
        this.capacity = k;
        this.front = null;
        this.rear = null;
    }

    @Override
    public boolean insertFront(int value) {
        if(this.isFull()) return false;
        DoubleLinkedNode doubleLinkedNode = new DoubleLinkedNode(value);
        if(front==null){
            front = rear = doubleLinkedNode;
        }
        else {
            front.pre = doubleLinkedNode;
            doubleLinkedNode.next = front;
            front = doubleLinkedNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean insertLast(int value) {
        if(this.isFull()) return false;
        DoubleLinkedNode doubleLinkedNode = new DoubleLinkedNode(value);
        if(front==null){
            front = rear = doubleLinkedNode;
        }
        else {
            rear.next = doubleLinkedNode;
            doubleLinkedNode.pre = rear;
            rear = doubleLinkedNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean deleteFront() {
        if(this.isEmpty()) return false;
        if(this.size==1) front = rear = null;
        else {
            front = front.next;
            front.pre = null;
            this.size--;
        }
        return true;
    }

    @Override
    public boolean deleteLast() {
        if(this.isEmpty()) return false;
        if(this.size==1) front = rear = null;
        else {
            rear = rear.pre;
            rear.next = null;
            size--;
        }
        return true;
    }

    @Override
    public int getFront() {
        return this.isEmpty() ? -1 : this.front.val;
    }

    @Override
    public int getRear() {
        return this.isEmpty() ? -1 : this.rear.val;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public boolean isFull() {
        return this.capacity == this.size;
    }
}


