package com.gersimenko.cost;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


// замокать сканнер

@ExtendWith(MockitoExtension.class)
class NumberReaderImplTest {

    @InjectMocks
    NumberReaderImpl numberReader;
    @Mock
    NumberReaderImpl numberReaderImpl;
    @Mock
    Scanner scanner;


    @Test
    @DisplayName("Тест на null")
    void readingNullResultTest() {
        int result = numberReaderImpl.readNumber();
        assertNotNull(result);
    }

    @Test
    @DisplayName("Тест чтения")
    public void readNumberTest() {
        when(scanner.nextInt()).thenReturn(3);
        int result = numberReader.readNumber();
        verify(scanner).nextInt();
        assertEquals(3, result);
    }
}