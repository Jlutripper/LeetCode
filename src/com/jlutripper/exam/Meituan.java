package com.jlutripper.exam;

import java.util.*;

/**
 * @description:
 * @author: Jlutripper
 * @create: 2022-08-27 15:57
 **/


public class Meituan {

    /**
     * @Param: []
     * @return: int
     * @Description: 神奇字符
     * @Author: Jlutripper
     * @Date: 2022/8/27 16:04
     */
    public int solution1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[] S = sc.nextLine().toCharArray();
        char[] s = sc.nextLine().toCharArray();
        int ans = 0;

        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j < m; j++) {
                if (s[j] == '*') continue;
                if (S[i + j] != s[j]) {
                    ans--;
                    break;
                }
            }
            ans++;
        }
        return ans;
    }


    public static List<List<Integer>> getPermute(int n){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) nums[i] = i;

        for(int i : nums) temp.add(i);

        trackBack(n,ans,temp,0);
        return ans;

    }

    public static void trackBack(int n, List<List<Integer>> ans, List<Integer> temp, int a){
        if(a==n) ans.add(new ArrayList<>(temp));
        for(int i = a;i<n;i++){
            Collections.swap(temp,a,i);
            trackBack(n,ans,temp,a+1);
            Collections.swap(temp,a,i);
        }
    }

    public static void main(String[] args) {

    }

    public void solution3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        int[] len = new int[m];
        for (int i = 0; i < m; i++) {
            len[i] = sc.nextInt();
        }
        String[] strings = new String[m];
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            strings[i] = sc.nextLine();
        }

        List<List<Integer>> ansList = getPermute(n);

        int ans = 0;

        for(List<Integer> list : ansList){
            StringBuilder add = new StringBuilder();
            for (Integer integer : list) {
                add.append(strings[integer]);
            }
            if(S.equals(add.toString())) ans++;
        }

        System.out.println(ans);

    }

    public void solution4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] electric = new int[n];
        int[] time = new int[b];
        for(int i=0;i<n;i++) electric[i] = sc.nextInt();
        for(int i=0;i<b;i++) time[i] = sc.nextInt();

        System.out.println(-1);


    }

    public void solution2(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] opt = new int[m];
        for (int i = 0; i < m; i++) opt[i] = sc.nextInt();
        Deque<Integer> deque = new LinkedList<>();
        for(int i=1;i<=n;i++) deque.offer(i);
        for(int o : opt){
            deque.remove(o);
            deque.addFirst(o);
        }
        for(int i : deque) System.out.print(i);
        System.out.println();
    }

}
