package com.jlutripper.leetcode.everyday.MyCircularDeque;
/**
* @Description: 641. 设计循环双端队列
* @Author: Jlutripper
* @Date: 2022/8/16
*/
public interface MyCircularDeque {

   boolean insertFront(int value);

   boolean insertLast(int value);

   boolean deleteFront();

   boolean deleteLast();

   int getFront();

   int getRear();

   boolean isEmpty();

   boolean isFull();
}
