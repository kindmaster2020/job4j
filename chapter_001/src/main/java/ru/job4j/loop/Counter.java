package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int var = start; var <= finish; var++) {
            sum = sum + var;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int var = start; var <= finish; var++) {
            if (var % 2 == 0) {
                sum = sum + var;
            }
        }
        return sum;
    }
}