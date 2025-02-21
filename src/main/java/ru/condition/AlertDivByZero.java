package ru.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        boolean result = number == 0;
        if (result) {
            System.out.println("Could not div by 0.");
        } else if (number < 0) {
            System.out.println("This is negative number");
        } else {
            System.out.println("Number is positive.");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(4);
        AlertDivByZero.possibleDiv(0);
        AlertDivByZero.possibleDiv(-2);
    }
}

