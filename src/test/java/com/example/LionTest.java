package com.example;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.List;


import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class LionTest {


    @Mock
    private FelineBehavior felineMock;


    @Test
    void maleHasManeAndDelegates() throws Exception {
        when(felineMock.getKittens()).thenReturn(2);
        when(felineMock.eatMeat()).thenReturn(List.of("Животные"));


        Lion lion = new Lion("Самец", felineMock);


        assertTrue(lion.doesHaveMane());
        assertEquals(2, lion.getKittens());
        assertEquals(1, lion.getFood().size());


        verify(felineMock, times(1)).getKittens();
        verify(felineMock, times(1)).eatMeat();
    }


    @Test
    void femaleHasNoMane() throws Exception {
        Lion lion = new Lion("Самка", felineMock);
        assertFalse(lion.doesHaveMane());
    }
}