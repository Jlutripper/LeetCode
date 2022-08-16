package com.jlutripper.leetcode.everyday.MyCircularDeque;

/**
 * @ClassName: MyArrListCircularDeque
 * @Description:
 * @Auther: Jlutripper
 * @Date: 2022/8/16 14:49
 */

public class MyArrListCircularDeque implements MyCircularDeque {

    private final int[] arr;
    private int front;
    private int rear;
    private final int capacity;

    public MyArrListCircularDeque(int k) {
        capacity = k + 1;
        this.arr = new int[capacity];
        front = 0;
        rear = 0;
    }

    @Override
    public boolean insertFront(int value) {
        if (this.isFull()) return false;
        front = (front - 1 + capacity) % capacity;
        arr[front] = value;
        return true;
    }

    @Override
    public boolean insertLast(int value) {
        if (this.isFull()) return false;
        arr[rear] = value;
        rear = (rear + 1) % capacity;
        return true;
    }

    @Override
    public boolean deleteFront() {
        if (this.isEmpty()) return false;
        front = (front + 1) % capacity;
        return true;
    }

    @Override
    public boolean deleteLast() {
        if (this.isEmpty()) return false;
        rear = (rear - 1 + capacity) % capacity;
        return true;
    }

    @Override
    public int getFront() {
        if(this.isEmpty()) return -1;
        return this.arr[front];
    }

    @Override
    public int getRear() {
        if(this.isEmpty()) return -1;
        return this.arr[(rear - 1 + capacity) % capacity];
    }

    @Override
    public boolean isEmpty() {
        return this.rear == this.front;
    }

    @Override
    public boolean isFull() {
        return (this.rear + 1) % capacity == front;
    }
}


