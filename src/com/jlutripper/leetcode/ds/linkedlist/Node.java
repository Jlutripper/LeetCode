package com.jlutripper.leetcode.ds.linkedlist;

public class Node {
    public int val;
    Node pre;
    Node next;

    public Node(int val){
        this.val = val;
    }

    boolean hasNext(){
        return this.next != null;
    }
}
