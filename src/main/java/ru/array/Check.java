package ru.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean isResult = true;
        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[0]) {
                isResult = false;
                break;
            }
        }
        return isResult;
    }
}

