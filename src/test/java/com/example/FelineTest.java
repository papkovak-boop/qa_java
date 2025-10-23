package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FelineTest {
    private Feline feline;

    @BeforeEach
    void setUp() {
        feline = new Feline();
    }

    @Test
    void eatMeatReturnsNotNull() throws Exception {
        List<String> food = feline.eatMeat();
        assertNotNull(food);
    }

    @Test
    void eatMeatContainsAnimals() throws Exception {
        List<String> food = feline.eatMeat();
        assertTrue(food.contains("Животные"));
    }

    @Test
    void eatMeatContainsBirds() throws Exception {
        List<String> food = feline.eatMeat();
        assertTrue(food.contains("Птицы"));
    }

    @Test
    void eatMeatContainsFish() throws Exception {
        List<String> food = feline.eatMeat();
        assertTrue(food.contains("Рыба"));
    }

    @Test
    void getFamilyShouldReturnCatFamily() {
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }

    @Test
    void defaultGetKittensReturnsOne() {
        int kittensCount = feline.getKittens();
        assertEquals(1, kittensCount);
    }
}