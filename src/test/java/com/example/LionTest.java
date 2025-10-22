package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LionTest {

    @Test
    void maleLionShouldHaveManeAndDelegateFoodAndKittens() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
        assertEquals(1, lion.getKittens());
        var food = lion.getFood();
        assertNotNull(food);
        assertTrue(food.contains("Животные"));
        assertTrue(food.contains("Птицы"));
        assertTrue(food.contains("Рыба"));
    }

    @Test
    void femaleLionShouldNotHaveMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    void invalidSexShouldThrowException() {
        Feline feline = new Feline();
        Exception ex = assertThrows(Exception.class, () -> new Lion("Другой", feline));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", ex.getMessage());
    }
}
