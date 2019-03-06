package ru.itpark.service;

public class BonusAmount {
    public int calculate (int[] sales){
        int sum = 0;
        int min = 10_000;
        int bonusPercent = 5;
        for (int sale : sales){
            if (sale > min){
               int bonus = (sale - min) * bonusPercent / 100;
                sum = bonus + sum;
            }
        }
        return sum;
    }
}
