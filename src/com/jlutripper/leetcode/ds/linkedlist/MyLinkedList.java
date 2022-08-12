package com.jlutripper.leetcode.ds.linkedlist;

public class MyLinkedList {
    private int size;
    Node dummy,cur,pre;

    public MyLinkedList() {
        size = 0;
        dummy = new Node(0);
    }

    public int get(int index) {
        if(size == 0 ||index < 0 || index > size) return -1;
        cur = dummy;
        for(int i=-1;i<index;i++){
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        if(dummy.next == null) dummy.next = new Node(val);
        else{
            Node add = new Node(val);
            add.next = dummy.next;
            dummy.next = add;
        }
        size++;
    }

    public void addAtTail(int val) {
        if(dummy.next == null) dummy.next = new Node(val);
        else{
            Node tmp = dummy;
            while(tmp.hasNext()){
                tmp = tmp.next;
            }
            tmp.next = new Node(val);
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index<=0) this.addAtHead(val);
        else if(index>size) return;
//       else if(index=size) this.addAtTail(val);
        else{
            pre = dummy;
            cur = dummy.next;
            for(int i=0;i<index;i++){
                pre = cur;
                cur = cur.next;
            }
            Node now = new Node(val);
            pre.next = now;
            now.next = cur;
        }
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return;
        else{
            pre = dummy;
            cur = dummy.next;
            for(int i=0;i<index;i++){
                pre = cur;
                cur = cur.next;
            }
            pre.next = cur.next;
        }
        size--;
    }
}
