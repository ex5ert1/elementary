package ru.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean even = number % 2 == 0;

        if (even && divisibleBy3) {
            return "The number divides by 6.";
        } else if (even) {
            return "The number doesn't divide by 3, but it is the even number.";
        } else if (divisibleBy3) {
            return "The number divides by 3, but it isn't the even number.";
        } else {
            return "The number doesn't divide by 3 and it isn't the even number.";
        }
    }
}

