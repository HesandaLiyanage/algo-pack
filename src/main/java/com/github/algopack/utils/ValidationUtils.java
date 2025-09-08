package com.github.algopack.utils;

public class ValidationUtils {
    public static <T> T requireNonNull(T obj, String message) {
        if (obj == null) throw new NullPointerException(message);
        return obj;
    }
}
