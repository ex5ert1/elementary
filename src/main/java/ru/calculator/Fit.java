package ru.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short manheight = 187;
        short womanheight = 175;
        double man = Fit.manWeight(manheight);
        double woman = Fit.womanWeight(womanheight);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 175 is " + woman);
    }

}


