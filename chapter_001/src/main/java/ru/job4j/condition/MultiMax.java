package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int rsl = first >= second ? first : second;
        int result = rsl >= third ? rsl : third;
        return result;
    }
}