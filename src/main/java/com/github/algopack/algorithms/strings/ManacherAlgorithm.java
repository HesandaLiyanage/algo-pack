package com.github.algopack.algorithms.strings;

public class ManacherAlgorithm {
    public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";
        return s.substring(0, 1);
    }
}
