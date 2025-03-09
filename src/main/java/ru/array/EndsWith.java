package ru.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean isResult = true;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - i - 1] != post[post.length - i - 1]) {
                isResult = false;
                break;
            }
        }
        return isResult;
    }
}

