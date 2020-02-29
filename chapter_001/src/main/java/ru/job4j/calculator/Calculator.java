/**
 * Class Класс для выполнения арифметических операция +, -, /, *.
 *
 * @author Dmitry Amelin (kindmaster2020@yandex.ru)
 * @since 16.02.2020
 * @version 1
 */
package ru.job4j.calculator;

public class Calculator {
    /**
     * Конструктор, вывод строки в консоль.
     *
     * @param args - args.
     */
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int four = 4;
        int five = 5;
        int six = 6;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}