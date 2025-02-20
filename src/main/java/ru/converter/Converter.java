package ru.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEuro = 1.4F;
        float outEuro = Converter.rubleToEuro(in);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 1.4. Test result : " + passedEuro);
        float expectedDollar = 1.5555556F;
        float outDollar = Converter.rubleToDollar(in);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 1.5555556. Test result : " + passedDollar);
    }
}

