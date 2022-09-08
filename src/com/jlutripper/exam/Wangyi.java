package com.jlutripper.exam;

import java.util.*;

/**
 * @description:
 * @author: Jlutripper
 * @create: 2022-09-04 14:53
 **/


public class Wangyi {
//    import java.util.Scanner;
//    public class Main {
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
//                int a = in.nextInt();
//                int b = in.nextInt();
//                System.out.println(a + b);
//            }
//        }
//    }

    public static void solution1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        while (sc.hasNext()) {
            int t = sc.nextInt() % k;
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        int ans = 1;
        for (Integer i : map.values()) {
            ans = Math.max(ans, i);
        }
        System.out.println(ans);

    }

    public static void solution2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        if (k == 0) {
            for (int i = 0; i < n; i++) {
                sb.append(0);
            }
            System.out.println(sb);
            return;
        }
        if (t + 1 > k || t + 1 > n) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < t + 1; i++) {
            sb.append(1);
            k--;
            n--;
        }
        while (n > 0) {
            sb.append(0);
            n--;
            if (k > 0) {
                sb.append(1);
                k--;
                n--;
            }
        }
        if (k > 0) System.out.println(-1);
        System.out.println(sb);
    }

    public static void solution3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int div = num / x;
            int mod = num % x;
            if (map.containsKey(div)) map.get(div).add(mod);
            else {
                List<Integer> list = new ArrayList<>();
                list.add(mod);
                map.put(div, list);
            }
        }
        Map.Entry<Integer, List<Integer>> entry;
        while (true) {
            entry = map.lastEntry();
            int key = entry.getKey();
            List<Integer> list = entry.getValue();
            if (k < list.size()) break;
            else {
                map.remove(key);
                k -= list.size();
                if (!map.containsKey(key - 1)) map.put(key - 1, list);
                else {
                    map.get(key - 1).addAll(list);
                }
            }
        }
        List<Integer> list = entry.getValue();
        Collections.sort(list);
        System.out.println(list.get(list.size() - k - 1));

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int x = sc.nextInt();
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
//        for (int i = 0; i < n; i++) priorityQueue.add(sc.nextInt());
//        for (int i = 0; i < k; i++) {
//            int num = priorityQueue.poll();
//            priorityQueue.add(num - x);
//        }
//        System.out.println(priorityQueue.poll());

    }

    static int ret;
    static class Node {
        public Node next;
        public int val;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void solution4() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Node> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new Node(sc.nextInt()));
        }
        while (sc.hasNext()) {
            Node from = map.get(sc.nextInt());
            from.next = map.get(sc.nextInt());
        }

    }

//    public static long dfs(Node root) {
//        if(root==null) return 0;
//        long left = dfs(root.next)
//
//    }

    public static long getNum(long num) {
        num = num % (long) (10E9 + 7);
        long ans = 0;
        for (long i = 0; i < Math.sqrt(num); i++) {
            while (num % i == 0) {
                num %= i;
                ans++;
            }
        }
        if (num!=0) ans++;
        return ans;
    }

    public static void main(String[] args) {
        while (true) {
            solution3();
        }
    }
}
