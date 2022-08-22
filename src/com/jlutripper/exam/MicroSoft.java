package com.jlutripper.exam;

import com.jlutripper.leetcode.tools.ListNode;

import java.util.*;

/**
 * @ClassName: MicroSoft
 * @Description:
 * @Auther: Jlutripper
 * @Date: 2022/8/19 20:12
 */

public class MicroSoft {
    public String solution2(String S) {
        // write your code in Java 8 (Java SE 8)
        char[] chars = S.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(Character c : chars){
            if(!map.containsKey(c)) map.put(c,1);
            else {
                if(map.get(c)==1) map.remove(c);
                list1.add(c-'0');
            }
        }

        for(Character key : map.keySet()){
            list2.add(key-'0');
        }

        StringBuffer sb = new StringBuffer();

        if(list1.size()==0){
            sb.append(list2.get(list2.size()-1));
            return sb.toString();
        }

        Collections.sort(list1);
        Collections.sort(list2);

        if(list1.get(list1.size()-1)==0){
            if(list2.isEmpty()) return "0";
            else return list2.get(list2.size()-1).toString();
        }
        for(int i=list1.size()-1;i>=0;i--){
            sb.append(list1.get(i));
        }


        if(!list2.isEmpty()) sb.append(list2.get(list2.size()-1));

        for(Integer i : list1){
            sb.append(i.toString());
        }

        return sb.toString();
    }

    public int solution1(int[] X, int[] Y, int W) {
        Arrays.sort(X);
        int cur = 0;
        int ans = 0;

        for(int i : X){
            if (cur != 0) {
                if (i <= cur) continue;
            }
            ans++;
            cur = i + W;
        }
        return ans;
    }

    class Node{
        public List<Node> next;
        public int level;
        public int val;
        public Node(int val) {
            this.val = val;
        }
    }
//    public int solution3(int[] A, int[] B) {
//        List<int[]> list = new ArrayList<>();
//        Map<Node,Integer> map = new HashMap<>();
//        int MAX_LEVEL = 1;
//
//        Node head = new Node(0);
//        head.level = 1;
//        map.put(head,0);
//
//        for(int i=0;i<A.length;i++){
//            int[] tmp = new int[2];
//            tmp[0] = A[i];
//            tmp[1] = B[i];
//            list.add(tmp);
//        }
//
//        Deque<Node> deque = new ArrayDeque<>();
//        deque.offer(head);
//        List<List<Node>> level = new ArrayList<>();
//
//        while(!list.isEmpty()){
//            int size = deque.size();
//            MAX_LEVEL++;
//            while (size>0){
//                Node temp = deque.poll();
//                for(int[] pair : list){
//                    if(pair[0]==temp.val){
//                        Node child = new Node(pair[1]);
//                        child.level = MAX_LEVEL;
//                        temp.next.add(child);
//                        list.remove(pair);
//                        continue;
//                    }
//                    if(pair[1]==temp.val){
//                        Node child = new Node(pair[0]);
//                        child.level = MAX_LEVEL;
//                        temp.next.add(child);
//                        list.remove(pair);
//                    }
//                }
//                size--;
//            }
//        }
//
//
//
//
//    }

    public static void main(String[] args) {
        String s = new MicroSoft().solution2("1000");

        System.out.println(s);
    }

}


