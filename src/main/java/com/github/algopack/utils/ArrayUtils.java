package com.github.algopack.utils;

import java.util.Random;

public class ArrayUtils {
    private static final Random RANDOM = new Random();

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i]; array[i] = array[j]; array[j] = temp;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i]; array[i] = array[j]; array[j] = temp;
    }

    public static void shuffle(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int j = RANDOM.nextInt(i + 1);
            swap(array, i, j);
        }
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) return false;
        }
        return true;
    }
}
