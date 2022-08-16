package com.jlutripper.leetcode.everyday.MyCircularQueue;

/**
 * @ClassName: MyCircularDeque
 * @Auther: Jlutripper
 * @Date: 2022/8/15 11:22
 */

public interface MyCircularDeque {
    //入队 队列未满 判断是否是第一个 size++
    boolean enQueue(int value);
    //出队 队列不为空 判断是否是最后一个 size--
    boolean deQueue();
    //空为-1
    int Front();
    int Rear();
    boolean isEmpty();
    boolean isFull() ;
}


