package com.gersimenko.cost;

public class NegativeValidatorImpl implements Validator {
    @Override
    public boolean isValid(int number) {

        if (number < 0) {
            System.out.println("Ошибка: вы ввели отрицательное число.");
        } return number > 0;
    }
}
