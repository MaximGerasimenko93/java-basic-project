package com.gersimenko.cost;
import org.apache.commons.lang3.StringUtils;

import java.io.PrintStream;


public class SenderImpl implements Sender {

   PrintStream out = System.out;

    @Override
    public void printResult(String text) {

        String suffix1 = " рубль";
        String suffix2 = " рубля";
        String suffix3 = " рублей";

        if (text.endsWith("один")) {
           out.println(StringUtils.capitalize(text.trim()) + suffix1);
        } else if (text.endsWith("два") || text.endsWith("три") || text.endsWith("четыре")) {
            out.println(StringUtils.capitalize(text.trim()) + suffix2);
        } else {
            out.println(StringUtils.capitalize(text.trim()) + suffix3);
        }
    }
}

