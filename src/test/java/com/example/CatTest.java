package com.example;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.List;


import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class CatTest {


    @Mock
    private FelineBehavior felineMock;


    @Test
    void soundAndFoodAndKittensDelegation() throws Exception {
        when(felineMock.getKittens()).thenReturn(3);
        when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы"));


        Cat cat = new Cat(felineMock);


        assertEquals("Мяу", cat.getSound());
        assertEquals(3, cat.getKittens());
        assertEquals(2, cat.getFood().size());


        verify(felineMock, times(1)).getKittens();
        verify(felineMock, times(1)).eatMeat();
    }
}