package com.jlutripper.leetcode.everyday;

/**
 * @ClassName: BusyStudent
 * @Description: 1450. 在既定时间做作业的学生人数
 * @Auther: Jlutripper
 * @Date: 2022/8/19 16:24
 */

public class BusyStudent {
    /**
     * @Description:
     * @Param: [startTime, endTime, queryTime]
     * @return: int
     * @Author: Jlutripper
     * @Date: 2022/8/19
     */
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int ans = 0;
        for (int i = 0; i < startTime.length; i++) {
            if(startTime[i]>queryTime) break;
            if(startTime[i]<=queryTime && endTime[i]>=queryTime) ans++;
        }
        return ans;
    }
}


