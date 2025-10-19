package com.example;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;


class FelineParameterizedTest {


    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "5, 5",
            "0, 0"
    })
    void getKittensWithDifferentCounts(int input, int expected) {
        Feline feline = new Feline();
        assertEquals(expected, feline.getKittens(input));
    }
}
