package ru.job4j.module;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println(rsl);
        int i = 2_147_483_600;
        System.out.println(i);
        float f = i;
        System.out.println("Вывод в консоль значения после преобразования: " + f);
        double d = 94.984751;
        i = (int) Math.round(d);
        System.out.println("Вывод в консоль значения после преобразования: " + i);

        char c = 45000;
        float i11 = c;
        System.out.println(i11);
    }
}
