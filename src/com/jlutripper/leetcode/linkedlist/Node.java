package com.jlutripper.leetcode.linkedlist;

public class Node {
    public int val;
    Node pre;
    Node next;

    public Node(int val){
        this.val = val;
    }

    boolean hasNext(){
        if(this.next==null) return false;
        else return true;
    }
}
