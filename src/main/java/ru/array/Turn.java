package ru.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        return array;
    }
}

