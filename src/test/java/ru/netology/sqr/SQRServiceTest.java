package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"random, 200, 300, 3",
                        "limit value, 100, 9801, 90" ,
                        "minimum value, 100, 101, 1 ",
                        "zero value, 10, 99, 0"})
    void shouldSqr(String testName, long downLimit, long upLimit, long expected) {
        SQRService service = new SQRService();
        long actual = service.sqr (downLimit, upLimit);
        assertEquals(expected, actual);
    }
}