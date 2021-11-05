package com.codedifferently.assessment.corejava.part04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BirdTest {
    private Bird birdTest;


    @BeforeEach
    public void setUp(){
        birdTest = new Bird("black", 30) {
            @Override
            public String move() {
                return null;
            }

            @Override
            public String color() {
                return null;
            }
        };
    }

    @Test
    @DisplayName("Bird Test 1")
    public void testBirdMove(){
        birdTest.setMove("fly");
        String expected = "fly";
        String actual = birdTest.getMove();
        Assertions.assertEquals(expected, actual);
    }

}
