package ru.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        if (amount <= 0 || salary <= 0 || percent < 0) {
            return -1;
        }
        while (amount > 0) {
            amount += amount * (percent / 100);
            amount -= salary;
            year++;
            if (amount > salary && percent >= 100) {
                return -2;
            }
        }
        return year;
    }
}
