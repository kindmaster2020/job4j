package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70; // // формула перевода рублей в евро
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллары
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        int expected1 = 2;
        int out1 = rubleToDollar(in);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2 dollars. Test result : " + passed1);
    }
}