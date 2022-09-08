package com.jlutripper.leetcode.algorithm.sort;

/**
 * @description: 快速排序
 * @author: Jlutripper
 * @create: 2022-08-26 22:32
 **/


public class QuickSort {

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = arr[low];
            int i = low;
            int j = high;


            while (i < j) {
                while (i < j && arr[j] > pivot) j--;
                if (i < j) arr[i++] = arr[j];
                while (i < j && arr[i] < pivot) i++;
                if (i < j) arr[j--] = arr[i];
            }
        }
    }
}
