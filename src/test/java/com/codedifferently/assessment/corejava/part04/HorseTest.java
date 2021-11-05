package com.codedifferently.assessment.corejava.part04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HorseTest {

    private Horse horseTest;

    @BeforeEach
    public void setUp(){
        horseTest = new Horse("black", 25);
    }

    @Test
    @DisplayName("Horse Test 1")
    public void testHorseMove(){
        horseTest.setMove("gallop");
        String expected = "gallop";
        String actual = horseTest.getMove();
        Assertions.assertEquals(expected, actual);
    }


}
