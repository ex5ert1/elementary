package ru.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean isResult = true;
        for (int i = 0; i < data.length; i++) {
            isResult &= (data[i] == data[0]);

        }
        return isResult;
    }
}

