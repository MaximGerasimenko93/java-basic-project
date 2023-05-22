package com.gersimenko.cost;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TextPresentationTest {

    @Mock
    NumberReader numberReader;
    @Mock
    NumberConverter numberConverter;
    @Mock
    Sender sender;
    @InjectMocks
    TextPresentation textPresentation = new TextPresentation(numberReader, numberConverter, sender);

    @Test
    @DisplayName("Тест запуска")
    public void testStart() {
    when(numberReader.readNumber()).thenReturn(3);
    when(numberConverter.toConvert(3)).thenReturn("три");
    doNothing().when(sender).printResult("три");

    textPresentation.start();

    verify(numberReader).readNumber();
    verify(numberConverter).toConvert(3);
    verify(sender).printResult("три");
    }
}
