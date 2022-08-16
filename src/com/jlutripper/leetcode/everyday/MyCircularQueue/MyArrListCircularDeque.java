package com.jlutripper.leetcode.everyday.MyCircularQueue;

/**
 * @ClassName: MyArrListCircularDeque
 * @Auther: Jlutripper
 * @Date: 2022/8/15 13:51
 */

public class MyArrListCircularDeque implements MyCircularDeque{

    private final int[] arr;
    private final int capacity;
    private int front;
    private int rear;

    public MyArrListCircularDeque(int k) {
        this.capacity = k + 1;
        arr = new int[capacity];
        front = rear = 0;
    }

    @Override
    public boolean enQueue(int value) {
       if(this.isFull()) return false;
       this.arr[rear] = value;
        rear = (rear+1)%capacity;
       return true;
    }

    @Override
    public boolean deQueue() {
        if(this.isEmpty()) return false;
        front = (front + 1) % capacity;
        return true;
    }

    @Override
    public int Front() {
        return !isEmpty() ? arr[front] : -1;
    }

    @Override
    public int Rear() {
        return !isEmpty() ? arr[(rear - 1 + capacity)%capacity] : -1;
    }

    @Override
    public boolean isEmpty() {
        return this.rear == this.front;
    }

    @Override
    public boolean isFull() {
        return ((rear + 1) % capacity) == front;
    }
}


