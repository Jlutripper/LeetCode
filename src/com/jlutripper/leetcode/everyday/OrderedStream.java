package com.jlutripper.leetcode.everyday;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: OrderedStream
 * @Description: 1656. 设计有序流
 * @Auther: Jlutripper
 * @Date: 2022/8/16 14:38
 */

public class OrderedStream {

    private final String[] arr;
    private int ptr = 1;
    /**
     * @Description: 构造函数
     * @Param: [n] 有序流的长度
     * @return: 有序流
     * @Author: Jlutripper
     * @Date: 2022/8/16
     */
    public OrderedStream(int n) {
        this.arr = new String[n+1];
        for(int i=0;i<n+1;i++) arr[i] = "";
    }

    /**
     * @Description: 如果idKey后值连续则输出至null
     * @Param: [idKey, value]
     * @return: java.util.List<java.lang.String>
     * @Author: Jlutripper
     * @Date: 2022/8/16
     */
    public List<String> insert(int idKey, String value) {
        List<String> ans = new ArrayList<>();

        this.arr[idKey] = value;
        while(ptr<arr.length && !arr[ptr].equals("")){
            ans.add(arr[ptr]);
            ptr++;
        }
        return ans;
    }
}


