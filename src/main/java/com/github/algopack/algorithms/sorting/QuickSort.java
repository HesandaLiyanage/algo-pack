package com.github.algopack.algorithms.sorting;

import com.github.algopack.utils.ArrayUtils;

public class QuickSort {
    public static void sort(int[] arr) { sort(arr, 0, arr.length - 1); }
    private static void sort(int[] arr, int l, int h) {
        if (l >= h) return;
        int p = arr[l], lt = l, gt = h, i = l + 1;
        while (i <= gt) {
            if (arr[i] < p) ArrayUtils.swap(arr, lt++, i++);
            else if (arr[i] > p) ArrayUtils.swap(arr, i, gt--);
            else i++;
        }
        sort(arr, l, lt - 1); sort(arr, gt + 1, h);
    }
}
