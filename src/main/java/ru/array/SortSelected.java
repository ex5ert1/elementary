package ru.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int minIndex = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, minIndex);
        }
        return data;
    }
}


