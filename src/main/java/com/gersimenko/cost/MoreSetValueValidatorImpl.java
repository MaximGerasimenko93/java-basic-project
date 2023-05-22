package com.gersimenko.cost;

public class MoreSetValueValidatorImpl implements Validator {
    @Override
    public boolean isValid(int number) {

        if (number > 999) {
            System.out.println("Ошибка: вы ввели число больше 999");
        } return number < 1000;
    }
}
