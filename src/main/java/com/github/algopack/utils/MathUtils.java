package com.github.algopack.utils;

public class MathUtils {
    public static long gcd(long a, long b) {
        while (b != 0) { long t = b; b = a % b; a = t; }
        return Math.abs(a);
    }
    public static boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        for (long i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }
}
