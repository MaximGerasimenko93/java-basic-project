package com.gersimenko.cost;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.io.PrintStream;

public class SenderImplTest {

    @Test
    public void testPrintResultForOne() {
        PrintStream printStream = Mockito.mock(PrintStream.class);
        SenderImpl sender = new SenderImpl();
        sender.out = printStream;
        sender.printResult("один");
        Mockito.verify(printStream).println("Один рубль");
    }

    @Test
    public void testPrintResultForTwo() {
        PrintStream printStream = Mockito.mock(PrintStream.class);
        SenderImpl sender = new SenderImpl();
        sender.out = printStream;
        sender.printResult("два");
        Mockito.verify(printStream).println("Два рубля");
    }

    @Test
    public void testPrintResultForFive() {
        PrintStream printStream = Mockito.mock(PrintStream.class);
        SenderImpl sender = new SenderImpl();
        sender.out = printStream;
        sender.printResult("пять");
        Mockito.verify(printStream).println("Пять рублей");
    }
}