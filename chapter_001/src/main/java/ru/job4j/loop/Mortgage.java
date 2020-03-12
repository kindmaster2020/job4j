package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double annualPayment = amount + amount * 0.01 * percent; // сумма кредита (1-ый год)
        double restOfPayment = annualPayment - salary; // остаток по выплате (1-ый год)
        year++; // выполнение условий по договору (1-ый год)
        while (restOfPayment > 0) {
            year++;
            annualPayment = restOfPayment + restOfPayment * percent * 0.01;
            restOfPayment = annualPayment - salary;
        }
        return year;
    }
}