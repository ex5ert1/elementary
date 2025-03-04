package ru.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен " + prices.length);
        String[] names = new String[4];
        names[0] = "Егор";
        names[1] = "Антон";
        names[2] = "Сергей";
        names[3] = "Федор";
        String a = names[0];
        String b = names[1];
        String c = names[2];
        String d = names[3];
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
