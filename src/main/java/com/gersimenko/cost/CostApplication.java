package com.gersimenko.cost;

public class CostApplication {

    public static void main(String[] args) {

        NumberReader numberReader = new NumberReaderImpl();
        NumberConverter numberConverter = new NumberConverterImpl();
        Sender sender = new SenderImpl();
        TextPresentation textPresentation = new TextPresentation(numberReader, numberConverter, sender);
        textPresentation.start();
    }
}
