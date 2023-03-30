package org.mps.plateau;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("LineCoverageTest")
public class LineCoverageTest {
    //Ramas: Solo verdadero o falso
    //Condiciones: Todas las posibilidades del if

    @Test
    public void nullPlateauTest(){
        int[] xs = null;

        assertThrows(IllegalArgumentException.class, () -> Plateau.longestPlateau(xs));
    }

    @Test
    public void plateauTest(){
        int[] xs = { 0, 1, 3, 3, 3, 3, 2, 1};

        Plateau.Pair obtainedValue = Plateau.longestPlateau(xs);

        Plateau.Pair expectedValue = new Plateau.Pair(2, 4);
        assertEquals(expectedValue, obtainedValue);
    }
}
