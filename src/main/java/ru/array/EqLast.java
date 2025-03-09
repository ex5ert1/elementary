package ru.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int i = 0; i < right.length; i++) {
            if (left[left.length - 1 - i] == right[right.length - 1 - i]) {
                return true;
            }
        }
        return false;
    }
}

