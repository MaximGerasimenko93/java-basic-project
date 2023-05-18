package com.gersimenko.cost;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Тест на целое число, тест на -, тест на < 999, тест на запуск метода, тест на корректную работу метода
 */

@ExtendWith(MockitoExtension.class)
class NumberConverterImplTest {

    @Mock
    NumberConverterImpl numberConverterImpl;
    @Mock
    Map<Integer, String> keyNumbersMap;

    @Test
    @DisplayName("Тест ввода отрицательного числа")
    public void negativeKeyTest() {

    }

}