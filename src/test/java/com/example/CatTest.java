package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void soundShouldBeMeow() {
        Cat cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void getKittensShouldReturnOneAndFoodListIsCorrect() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assertEquals(1, cat.getKittens());
    }

    @Test
    void getFoodShouldReturnFullMeatList() throws Exception {
        Cat cat = new Cat(new Feline());
        var food = cat.getFood();
        assertNotNull(food);
        assertTrue(food.contains("Животные"));
        assertTrue(food.contains("Птицы"));
        assertTrue(food.contains("Рыба"));
    }
}
