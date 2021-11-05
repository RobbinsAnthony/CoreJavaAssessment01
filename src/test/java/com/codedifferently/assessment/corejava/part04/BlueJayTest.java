package com.codedifferently.assessment.corejava.part04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BlueJayTest {

    private BlueJay blueJayTest;

    @BeforeEach
    public void setUp(){
        blueJayTest = new BlueJay(30);
    }

    @Test
    @DisplayName("Horse Test 1")
    public void testHorseMove(){
        blueJayTest.setColor("");
        String expected = "gallop";
        String actual = horseTest.getMove();
        Assertions.assertEquals(expected, actual);
    }
}
