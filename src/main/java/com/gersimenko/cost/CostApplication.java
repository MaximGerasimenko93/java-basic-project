package com.gersimenko.cost;

public class CostApplication {

    public static void main(String[] args) {

        Validator negativeValidator = new NegativeValidatorImpl();
        MoreSetValueValidatorImpl moreSetValueValidator = new MoreSetValueValidatorImpl();
        NumberReader numberReader = new NumberReaderImpl();

        NumberConverter numberConverter = new NumberConverterImpl();
        Sender sender = new SenderImpl();
        TextPresentation textPresentation = new TextPresentation(numberReader, numberConverter, sender);

        negativeValidator.isValid(numberReader.readNumber());
        moreSetValueValidator.isValid(numberReader.readNumber());

        textPresentation.start();
    }
}
