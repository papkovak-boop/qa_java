package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class CatTest {

    @Test
    void soundShouldBeMeow() {
        Cat cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void getKittensShouldReturnOne() {
        Cat cat = new Cat(new Feline());
        assertEquals(1, cat.getKittens());
    }

    @Test
    void getFoodShouldNotBeNull() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> food = cat.getFood();
        assertNotNull(food);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Животные", "Птицы", "Рыба"})
    void getFoodShouldContainExpectedItems(String expectedItem) throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> food = cat.getFood();
        assertTrue(food.contains(expectedItem), "Список еды должен содержать: " + expectedItem);
    }
}
