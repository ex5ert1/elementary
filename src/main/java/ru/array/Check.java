package ru.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean isresult = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != data[0]) {
                isresult = false;
                break;
            }
        }
        return isresult;
    }
}

