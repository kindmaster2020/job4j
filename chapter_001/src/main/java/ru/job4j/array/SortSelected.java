package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int counter = 0; counter < data.length; counter++) {
            int min = MinDiapason.findMin(data, counter, data.length - 1);
            int index = FindLoop.indexOf(data, min, counter, data.length - 1);
            int temp = data[counter];
            data[counter] = min;
            data[index] = temp;
        }
        return data;
    }
}