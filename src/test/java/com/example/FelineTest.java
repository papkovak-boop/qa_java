package com.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;


class FelineTest {


    @Test
    void eatMeatReturnsList() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertNotNull(food);
        assertTrue(food.size() > 0);
        assertEquals("Животные", food.get(0));
    }


    @Test
    void getFamilyIsCatFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }


    @Test
    void defaultKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }
}