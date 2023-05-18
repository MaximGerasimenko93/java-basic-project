package com.gersimenko.cost;
import org.apache.commons.lang3.StringUtils;

public class SenderImpl implements Sender {

    @Override
    public void printResult(String text) {

        String suffix1 = " рубль";
        String suffix2 = " рубля";
        String suffix3 = " рублей";

        if (text.endsWith("один")) {
            System.out.println(StringUtils.capitalize(text.trim()) + suffix1);
        } else if (text.endsWith("два") || text.endsWith("три") || text.endsWith("четыре")) {
            System.out.println(StringUtils.capitalize(text.trim()) + suffix2);
        } else {
            System.out.println(StringUtils.capitalize(text.trim()) + suffix3);
        }
    }
}

