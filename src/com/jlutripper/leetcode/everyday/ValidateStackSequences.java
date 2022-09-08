package com.jlutripper.leetcode.everyday;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @description: 946. 验证栈序列
 * @author: Jlutripper
 * @create: 2022-08-31 00:07
 **/


public class ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> deque = new ArrayDeque<>();
        int i = 0;
        int j = 0;
        while (i < popped.length && j < popped.length) {
            int push = pushed[i];
            int pop = popped[j];
            int in_stack = deque.isEmpty() ? -1 : deque.peekLast();
            if (push == pop) {
                if (i + 1 < popped.length) i++;
                j++;
                System.out.println(push + "直接出栈");
            } else if (in_stack == pop) {
                j++;
                deque.pollLast();
                System.out.println(in_stack+"出栈");
            }else if(deque.contains(pop)) return false;
            else {
                deque.offer(push);
                i++;
                System.out.println(push+"入栈");
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        new ValidateStackSequences().validateStackSequences(pushed,popped);
    }
}
