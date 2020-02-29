package ru.job4j.loop;

public class Mortgage {
    public int year (int amount, int salary, double percent) {
        int year = 1;
        double annualPayment = amount * 0.01 * percent; // начисленный годовой процент
        double restOfPayment = amount + annualPayment - salary; // остаток по выплате в конце года
        while ((amount + restOfPayment) > salary) {
            amount += restOfPayment - salary;
            year++;
        }
        return year;
    }
}