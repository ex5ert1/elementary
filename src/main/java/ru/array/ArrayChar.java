package ru.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean isResult = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                isResult = false;
                break;
            }
        }
        return isResult;
    }
}

