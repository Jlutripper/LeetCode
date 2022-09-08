package com.jlutripper.exam;

import java.sql.Driver;
import java.util.*;

/**
 * @description:
 * @author: Jlutripper
 * @create: 2022-08-27 18:17
 **/


public class Honor {
//import java.util.Scanner;
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
     * @Description: '101'首次出现的位置
     * @Author: Jlutripper
     * @Date: 2022/8/27 18:19
     */
    public void solution1() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] chars = Integer.toBinaryString(num).toCharArray();
        boolean flag = false;
        int ans = 0;
        int loc = 0;
        for (int i = chars.length - 1; i >= 2; i--) {
            if (chars[i] == '1' && chars[i - 1] == '0' && chars[i - 2] == '1') {
                ans++;
                if (!flag) {
                    loc = chars.length - 1 - i;
                    flag = true;
                }
            }
        }
        if (!flag) loc = -1;
        System.out.println(ans + " " + loc);

    }

    static class Driver {
        public double second;
        public int rank;

        public int No;

        public Driver(double second, int rank, int No) {
            this.second = second;
            this.rank = rank;
            this.No = No;
        }
    }

    /**
     * @Param: []
     * @return: void
     * @Description: 最快评分最高司机
     * @Author: Jlutripper
     * @Date: 2022/8/27 18:51
     */

    public void solution2() {

        Scanner sc = new Scanner(System.in);
        String[] path = sc.nextLine().split(",");
        String[] busyPath = sc.nextLine().split(",");
        String[] light = sc.nextLine().split(",");
        String[] rank = sc.nextLine().split(",");
        List<Driver> list = new ArrayList<>();

        for (int i = 0; i < path.length; i++) {
            int PATH = Integer.parseInt(path[i]);
            int BUSY_PATH = Integer.parseInt(busyPath[i]);
            int NORMAL_PATH = PATH - BUSY_PATH;
            int LIGHT = Integer.parseInt(light[i]);
            int RANK = Integer.parseInt(rank[i]);

            double second = (double)NORMAL_PATH/10 + (double)BUSY_PATH/2 + LIGHT*7.5;
            list.add(new Driver((int)second,RANK,i+1));
        }

        Collections.sort(list, new Comparator<Driver>() {
            @Override
            public int compare(Driver o1, Driver o2) {
                return (int)(o1.second - o2.second);
            }
        });

        Driver faster = list.get(0);

        Collections.sort(list, new Comparator<Driver>() {
            @Override
            public int compare(Driver o1, Driver o2) {
                 if(o2.rank - o1.rank!=0) return o2.rank - o1.rank;
                 else return (int)(o1.second - o2.second);
            }
        });

        for(Driver d : list){
            if(d.second - faster.second < 60)
                System.out.println(d.No + "," + (int)d.second);
            return;
        }

        System.out.println(faster.No + "," + (int)faster.second);

    }

    public void solution3() {
        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().split(":");
        int cmd = Integer.parseInt(in[0]);
        String opt = in[1];
        int[] redis = new int[1000];
        for (int i = 0; i < 20; i++) redis[i * 50] = 1;
        switch (cmd) {
            case 1:
                int NO = Integer.parseInt(opt.split("_")[1]);
                System.out.println((NO - 1) * 50);
                break;
            case 2:
                int loc2 = parseToken(opt);
                System.out.println(((loc2 / 50) +1 ) * 50);
                break;
            case 3:
                String[] servers = opt.split(";")[0].split(",");
                int loc3 = parseToken(opt.split(";")[1]);
                int[] brokenServers = new int[servers.length];
                for (int i = 0; i < servers.length; i++) brokenServers[i] = Integer.parseInt(servers[i].split("_")[1]);
                Arrays.sort(brokenServers);
                loc3 = loc3/50 + 1;
                if (loc3 < brokenServers[0] || loc3 > brokenServers[brokenServers.length - 1]) System.out.println(loc3 * 50);
                else {
                    boolean flag = false;
                    for (int i : brokenServers) {
                        if (i > loc3) {
                            flag = true;
                            System.out.println(loc3 * 50);
                        }
                        if (i == loc3) loc3++;
                    }
                    if (!flag) System.out.println(loc3 * 50);
                }
                break;
            case 4:
                int serverNo = Integer.parseInt(opt.split("_")[2]);
                if (serverNo % 2 == 0) System.out.println(525 + ((serverNo / 2) - 1) * 50);
                else System.out.println(25 + ((serverNo + 1) / 2 - 1) * 50);
                break;
            case 5:
                int serverNo1 = Integer.parseInt(opt.split(";")[0]);
                String token5 = opt.split(";")[1];
                int loc5 = parseToken(token5);
                for(int i=1;i<=serverNo1;i++){
                    if (serverNo1 % 2 == 0) redis[525 + ((serverNo1 / 2) - 1) * 50] = 1;
                    else redis[25 + ((serverNo1 + 1) / 2 - 1) * 50] = 1;
                }
                while(loc5<=1000){
                    if(redis[loc5]==1) System.out.println(loc5);
                    else loc5++;
                }

        }
    }

    public static int parseToken(String token) {
        char[] chars = token.toCharArray();
        int sum = 0;
        for (Character c : chars) sum += c - 'a' + 48;
        return sum % 999;
    }

    public static void main(String[] args) {
        while (true) new Honor().solution3();
    }
}
