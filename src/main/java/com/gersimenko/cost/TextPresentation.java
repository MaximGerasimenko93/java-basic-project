package com.gersimenko.cost;

public class TextPresentation {

    private NumberReader numberReader;
    private NumberConverter numberConverter;
    private Sender sender;

    public TextPresentation(NumberReader numberReader, NumberConverter numberConverter, Sender sender) {
        this.numberReader = numberReader;
        this.numberConverter = numberConverter;
        this.sender = sender;
    }

    public void start() {

        int number = numberReader.readNumber();
        String text = numberConverter.toConvert(number);
        sender.printResult(text);
    }
}
