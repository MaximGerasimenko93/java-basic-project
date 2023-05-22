package com.gersimenko.cost;

import java.util.HashMap;
import java.util.Map;

public class NumberConverterImpl implements NumberConverter {

    Map<Integer, String> keyNumbersMap = new HashMap<>();

    @Override
    public String toConvert(int number) {

        keyNumbersMap.put(1, "один");
        keyNumbersMap.put(2, "два");
        keyNumbersMap.put(3, "три");
        keyNumbersMap.put(4, "четыре");
        keyNumbersMap.put(5, "пять");
        keyNumbersMap.put(6, "шесть");
        keyNumbersMap.put(7, "семь");
        keyNumbersMap.put(8, "восемь");
        keyNumbersMap.put(9, "девять");
        keyNumbersMap.put(10, "десять");
        keyNumbersMap.put(11, "одиннадцать");
        keyNumbersMap.put(12, "двенадцать");
        keyNumbersMap.put(13, "тринадцать");
        keyNumbersMap.put(14, "четырнадцать");
        keyNumbersMap.put(15, "пятнадцать");
        keyNumbersMap.put(16, "шестндацать");
        keyNumbersMap.put(17, "семнадцать");
        keyNumbersMap.put(18, "восемндацать");
        keyNumbersMap.put(19, "девятнадцать");
        keyNumbersMap.put(20, "двадцать");
        keyNumbersMap.put(30, "тридцать");
        keyNumbersMap.put(40, "сорок");
        keyNumbersMap.put(50, "пятьдесят");
        keyNumbersMap.put(60, "шестьдесят");
        keyNumbersMap.put(70, "семьдесят");
        keyNumbersMap.put(80, "восемьдесят");
        keyNumbersMap.put(90, "девяносто");
        keyNumbersMap.put(100, "сто");
        keyNumbersMap.put(200, "двести");
        keyNumbersMap.put(300, "триста");
        keyNumbersMap.put(400, "четыреста");
        keyNumbersMap.put(500, "пятьсот");
        keyNumbersMap.put(600, "шестьсот");
        keyNumbersMap.put(700, "семьсот");
        keyNumbersMap.put(800, "восемьсот");
        keyNumbersMap.put(900, "девятьсот");

        String text = "";
        if (number >= 100) {
            text = text + keyNumbersMap.get(number / 100 * 100) + " ";
            number = number % 100;
        }

        if (number >= 20) {
            text = text + keyNumbersMap.get(number / 10 * 10) + " ";
            number = number % 10;
        }

        if (number > 0) {
            text = text + keyNumbersMap.get(number);
        }
        return text;
    }
}
