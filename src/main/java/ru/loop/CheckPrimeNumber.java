package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime && number > 1;
    }
}
