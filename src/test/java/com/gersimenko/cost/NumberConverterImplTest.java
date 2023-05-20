package com.gersimenko.cost;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class NumberConverterImplTest {
    @InjectMocks
    NumberConverterImpl numberConverter;
    @Mock
    Map<Integer, String> keyNumbersMapMock;

    @Test
    public void testToConvert() {
        when(keyNumbersMapMock.get(1)).thenReturn("один");
        when(keyNumbersMapMock.get(2)).thenReturn("два");
        when(keyNumbersMapMock.get(3)).thenReturn("три");
        when(keyNumbersMapMock.get(4)).thenReturn("четыре");
        when(keyNumbersMapMock.get(5)).thenReturn("пять");
        when(keyNumbersMapMock.get(6)).thenReturn("шесть");
        when(keyNumbersMapMock.get(7)).thenReturn("семь");
        when(keyNumbersMapMock.get(8)).thenReturn("восемь");
        when(keyNumbersMapMock.get(9)).thenReturn("девять");
        when(keyNumbersMapMock.get(10)).thenReturn("десять");

        assertEquals("один", numberConverter.toConvert(1));
        assertEquals("два", numberConverter.toConvert(2));
        assertEquals("три", numberConverter.toConvert(3));
        assertEquals("четыре", numberConverter.toConvert(4));
        assertEquals("пять", numberConverter.toConvert(5));
        assertEquals("шесть", numberConverter.toConvert(6));
        assertEquals("семь", numberConverter.toConvert(7));
        assertEquals("восемь", numberConverter.toConvert(8));
        assertEquals("девять", numberConverter.toConvert(9));
        assertEquals("десять", numberConverter.toConvert(10));
    }
}