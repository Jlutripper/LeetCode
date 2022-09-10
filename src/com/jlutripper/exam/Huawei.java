package com.jlutripper.exam;

import java.util.*;

/**
 * @description:
 * @author: Jlutripper
 * @create: 2022-09-09 18:56
 **/


public class Huawei {
    static int demand;
    static int n;
    static Set<String> ans;

    public static void solution1() {
        ans = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        String[] servers = sc.nextLine().split(" ");
        demand = sc.nextInt();
        int[] server = new int[servers.length];
        for (int i = 0; i < server.length; i++) {
            int num = Integer.parseInt(servers[i]);
            server[i] = num;
        }
        Arrays.sort(server);
        if (server[0] > demand) {
            System.out.println(-1);
            return;
        }

        n = demand / server[server.length - 1] + 1;
        List<Integer> list = new ArrayList<>();
        backtrack(server,list,0);

        if(ans.size()==0);
        n++;
        backtrack(server,list,0);

        for(String s :ans){
            System.out.println(s);
        }

    }

    public static void backtrack(int[] nums, List<Integer> track, int idx) {
        if (track.size() == n) {
            if(sum(track) == demand) {
                List<Integer> temp = new ArrayList<>(track);
                Collections.sort(temp);
                StringBuilder sb = new StringBuilder();
                for(int i : temp) {
                    sb.append(i);
                    sb.append(" ");
                }
                ans.add(sb.toString());
            }
            return;
        }
        for(int i=0;i<nums.length;i++){
             track.add(nums[i]);
             backtrack(nums,track,idx+1);
             track.remove(idx);
        }

    }
    public static void main(String[] args) {
        solution1();
    }

    public static int sum(List<Integer> track) {
        int ans = 0;
        for (int i : track) ans += i;
        return ans;
    }

    public static void opt(){

    }

    /******************/
    private static List<Integer> res = new ArrayList<>();

    public void solution2() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, List<Integer>> depMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            int id = sc.nextInt();
            if (!depMap.containsKey(id)) depMap.put(id, new ArrayList<>());
            List<Integer> list = depMap.get(id);
            for (int j = 1; j < n; j++) list.add(sc.nextInt());
        }

        for (Integer key : depMap.keySet()) {
            dfs(key, new ArrayList<Integer>(), depMap);
            if (res.size() > 0) break;
        }

        Integer min = Integer.MAX_VALUE;

        int minId = -1;
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i) < min) {
                min = res.get(i);
                minId = i;
            }
        }
        System.out.print(res.get(minId));
        int printId = minId + 1;
        while (printId != minId){
            if(printId < res.size()){
                System.out.println(" "+ res.get(printId));
                printId++;
            }
            else printId = printId % res.size();
        }
        System.out.println(" "+ res.get(minId));
    }



    public static void dfs(Integer key, List<Integer> curList, Map<Integer, List<Integer>> depMap) {
        if (!depMap.containsKey(key)) return;
        if (res.size() > 0) return;
        if (curList.contains(key)) {
            int id = curList.indexOf(key);
            for (int i = id; i < curList.size(); i++) {
                res.add(curList.get(i));
            }
            return;
        }
        for (Integer next : depMap.get(key)) {
            curList.add(key);
            dfs(next, curList, depMap);
            curList.remove(curList.size() - 1);
        }
    }

    /**
     * @Param:
     * @return: void
     * @Description: M*N的格子 A 120 有一个少30  B 40 多一个加20 不必都放
     * @Author: Jlutripper
     * @Date: 2022/9/9 19:28
     * 2 3 1 2 240
     * 3 1 2 1 260
     * 2 2 4 0 240
     */
    public void solution3() {

        int[][] direct = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int M, N, A, B;
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();

        if (A == 0 && B == 0) {
            System.out.println(0);
            return;
        }
        if (M == 1 && N == 1) {
            if (A > 0) System.out.println(120);
            else if (B > 0) System.out.println(40);
            else System.out.println(0);
            return;
        }

        int[][] matrix = new int[M][N];


    }


}
