package ru.itpark.service;

public class Main {
    public static void main(String[] args) {
        BonusAmount service = new BonusAmount();
        int[] sales = {12_000, 8_000, 15_000, 9_000};
        int sum = service.calculate(sales);
        System.out.println(sum);
    }
}
