package com.gersimenko.cost;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class NumberReaderImplTest {

    @InjectMocks
    NumberReaderImpl numberReaderImpl;

    @Test
    @DisplayName("Тест ввода отрицательного числа")
    void readingNegativeNumberTest() {
        int result = numberReaderImpl.readNumber();
        assertTrue(result < 0, "Вы ввели отрицательное число");
    }

    @Test
    @DisplayName("Тест ввода числа больше 1000")
    void readingThousandNumberTest() {
        int result = numberReaderImpl.readNumber();
        assertTrue(result > 999, "Вы ввели число больше 999");
    }

    @Test
    @DisplayName("Тест нуля")
    void readingZeroTest() {
        int result = numberReaderImpl.readNumber();
        assertTrue(result == 0, "0 рублей не может быть");
    }

    // подумать как протестировать ввод целого значения вместо чего-либо другого
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