package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class LionTest {

    private Lion maleLion;
    private Lion femaleLion;
    private Feline feline;


    @BeforeEach
    void setUp() throws Exception {
        feline = new Feline();
        maleLion = new Lion("Самец", feline);
        femaleLion = new Lion("Самка", feline);
    }

    @Test
    void maleLionShouldHaveMane() {
        assertTrue(maleLion.doesHaveMane());
    }

    @Test
    void maleLionShouldHaveOneKitten() {
        assertEquals(1, maleLion.getKittens());
    }

    @Test
    void maleLionFoodShouldNotBeNull() throws Exception {
        List<String> food = maleLion.getFood();
        assertNotNull(food);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Животные", "Птицы", "Рыба"})
    void maleLionFoodShouldContainExpectedItems(String expectedItem) throws Exception {
        List<String> food = maleLion.getFood();
        assertTrue(food.contains(expectedItem), "Список еды должен содержать: " + expectedItem);
    }

    @Test
    void femaleLionShouldNotHaveMane() {
        assertFalse(femaleLion.doesHaveMane());
    }

    @Test
    void invalidSexShouldThrowException() {
        Exception ex = assertThrows(Exception.class, () -> new Lion("Другой", feline));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", ex.getMessage());
    }
}