package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                while (array[point] == null) {
                    if (point < array.length -1) {
                        point++;
                    } else break;
                }
                array[index] = array[point];
                array[point] = null;
            }
        }
        return array;
    }
}