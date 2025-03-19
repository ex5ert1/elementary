package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int changeAmount = money - price;
        for (int coin : coins) {
            while (changeAmount >= coin) {
                rsl[size++] = coin;
                changeAmount -= coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}

