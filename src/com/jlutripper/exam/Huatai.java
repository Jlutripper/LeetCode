package com.jlutripper.exam;

import java.util.*;

/**
 * @description:
 * @author: Jlutripper
 * @create: 2022-08-28 20:24
 **/


public class Huatai {
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

    /**
     * @Param: []
     * @return: void
     * @Description: 判断是否为树
     * @Author: Jlutripper
     * @Date: 2022/8/28 20:28
     */

    static class Node {
        public int in;

        public Node(int in) {
            this.in = in;
        }

        public Node() {
        }
    }

    public void solution1() {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<int[]>> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        List<String> cases = new ArrayList<>();
        while (sc.hasNext()) {
            int a = sc.nextInt();
            if(a!=0) sb.append(a);
            else {
                sc.nextInt();
                cases.add(sb.toString());
                sb = new StringBuilder();
            }

        }
        int caseNo = 1;
        for (int i = 0; i < cases.size() - 1; i++) {
            if(cases.get(i).equals("")){
                System.out.println("Case " + caseNo + " is a tree.");
                continue;
            }
            isTree(cases.get(i), caseNo);
            caseNo++;
        }
    }

    public static void isTree(String s, int No) {
        Map<Integer, Node> map = new HashMap<>();
        char[] nodes = s.toCharArray();
        for(int i=0;i<s.length();i+=2){
            int a = nodes[i] - '0';
            int b = nodes[i+1] - '0';
            if(!map.containsKey(a)) map.put(a,new Node(0));
            if(!map.containsKey(b)) map.put(b,new Node(1));
            else {
                Node nodeB = map.get(b);
                if(nodeB.in==0) nodeB.in++;
                else{
                    System.out.println("Case " + No + " is not a tree.");
                    return;
                }
            }
        }
        int root = 0;
        for(Node n : map.values()){
            if(n.in==0) root++;
            if(root>1){
                System.out.println("Case " + No + " is not a tree.");
                return;
            }
        }
        System.out.println("Case " + No + " is a tree.");
    }


    /**
     * 二分查找
     *
     * @param n int整型 数组长度
     * @param v int整型 查找值
     * @param a int整型一维数组 有序数组
     * @return int整型
     */
    public int upper_bound_(int n, int v, int[] a) {
        if (n == 0) return 1;
        if (n == 1) {
            if (a[0] < v) return 2;
            else return 1;
        }

        int le = 0;
        int ri = n - 1;

        while (le < ri) {
            int mid = le + (ri - le) / 2;
            if (a[mid] < v) le = mid + 1;
            else if (a[mid] >= v) ri = mid;
        }
        if (a[ri] >= v) return ri + 1;
        return n + 1;
    }

    public void solution3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ability = new int[n];
        for (int i = 0; i < n; i++) ability[i] = sc.nextInt();
        int k = sc.nextInt();
        int d = sc.nextInt();

        long[][] matrixA = new long[k + 1][n + 1];
        long[][] matrixB = new long[k + 1][n + 1];

        for (int i = 1; i < k + 1; i++) {
            matrixA[i][1] = ability[0];
            matrixB[i][1] = ability[0];
        }

        for (int i = 1; i < n + 1; i++) {
            matrixA[1][i] = ability[i - 1];
            matrixB[1][i] = ability[i - 1];
        }

        for (int i = 2; i < k + 1; i++) {
            for (int j = 2; j < n + 1; j++) {
                for (int q = Math.max(1, j - d); q < j; q++) {
                    matrixA[i][j] = Math.max(matrixA[i][j], Math.max(matrixA[i - 1][q] * ability[j - 1], matrixB[i - 1][k] * ability[j - 1]));
                    matrixB[i][j] = Math.max(matrixB[i][j], Math.min(matrixA[i - 1][q] * ability[j - 1], matrixB[i - 1][k] * ability[j - 1]));
                }
            }
        }

        long ans = Math.max(matrixA[k][1], matrixB[k][1]);
        for (int i = 2; i < n + 1; i++) {
            ans = Math.max(Math.max(matrixA[k][i], matrixB[k][i]), ans);
        }
        System.out.println(ans);


    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        new Huatai().upper_bound_(1, 3, a);
    }


}
