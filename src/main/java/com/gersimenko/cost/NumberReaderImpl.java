package com.gersimenko.cost;

import java.util.Scanner;

public class NumberReaderImpl implements NumberReader {

    Scanner scanner = new Scanner(System.in);

    @Override
    public int readNumber() {
        System.out.println("Пожалуйста, введите положительное число от 1 до 999:");
        return scanner.nextInt();
    }
}
