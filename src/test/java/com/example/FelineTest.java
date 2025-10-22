package com.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;

class FelineTest {
    private Feline feline;

    @BeforeEach
    void setUp() {
        feline = new Feline();
    }

    @Test
    void eatMeatReturnsMeatList() throws Exception {
        List<String> food = feline.eatMeat();
        assertNotNull(food);
        assertTrue(food.contains("Животные"));
        assertTrue(food.contains("Птицы"));
        assertTrue(food.contains("Рыба"));
    }


    @Test
    void getFamilyShouldReturnCatFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }


    @Test
    void defaultGetKittensReturnsOne() {
        assertEquals(1, feline.getKittens());
    }
}