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
        float rubles = 140;
        float euro = Converter.rubleToEuro(rubles);
        float dollars = Converter.rubleToDollar(rubles);
        System.out.println(rubles + " rubles are " + euro + " euro.");
        System.out.println(rubles + " rubles are " + dollars + " dollars.");
    }
}

