package com.codedifferently;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest {

    private Problem problem;

    @BeforeEach
    public void setUp(){
        problem = new Problem();
    }

    @Test
    public void reverseAStringTest1(){
        String input = "I Love Unit Testing";
        String expected = "Gnitset Tinu Evol I";
        String actual = problem.reverseAString(input);
        assertEquals(expected, actual);
    }

    @Test
    public void reverseAStringTest2(){
        String input = "Wutang Clan Is The Greatest";
        String expected = "Tsetaerg Eht Si Nalc Gnatuw";
        String actual = problem.reverseAString(input);
        assertEquals(expected, actual);
    }
}
