package ru.job4j.module1p6;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);

        String[] names = new String[4];

        names[0] = "Petr";
        names[1] = "Veronika";
        names[2] = "Misha";
        names[3] = "Kirill";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
