package com.github.algopack.algorithms.searching;

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) l = mid + 1; else r = mid - 1;
        }
        return -1;
    }
}
