package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if ((row + cell) % 2 == 0) {
                System.out.print("X"); // печатаем Х, если сумма индексов четная
                } else {
                    System.out.print(" "); // печатаем пробел, если сумма индексов нечетная
                }
            }
            System.out.println(); // добавляем перевод на новую строку
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}