package com.gersimenko.cost;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class NumberReaderImplTest {

    @InjectMocks
    NumberReaderImpl numberReaderImpl;
    Scanner scanner = mock(Scanner.class);

    @Test
    @DisplayName("Тест ввода отрицательного числа")
    void readingNegativeNumberTest() {
        int result = numberReaderImpl.readNumber();
        when(result).thenReturn(-5);
        assertTrue(result > 0, "Вы ввели отрицательное число");
    }

    @Test
    @DisplayName("Тест ввода числа больше 1000")
    void readingThousandNumberTest() {
        int result = numberReaderImpl.readNumber();
        when(result).thenReturn(1000);
        assertTrue(result < 999, "Вы ввели число больше 999");
    }
    @Test
    @DisplayName("Тест на null")
    void readingNullResultTest() {
        int result = numberReaderImpl.readNumber();
        assertNotNull(result);
    }

    @Test
    @DisplayName("Тест нуля")
    void readingZeroTest() {
        int result = numberReaderImpl.readNumber();
        when(result).thenReturn(0);
        assertTrue(result != 0, "0 рублей не может быть");
    }

    @Test
    @DisplayName("Тест ввода числа")
    void readingIntegerNumberTest() {
        int result = numberReaderImpl.readNumber();
    }

    @Test
    @DisplayName("Тест чтения")
    public void readNumberTest() {
        when(numberReaderImpl.readNumber()).thenReturn(3);
        verify(numberReaderImpl).readNumber();
    }
}