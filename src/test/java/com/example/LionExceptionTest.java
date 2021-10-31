package com.example;

import org.junit.Test;

public class LionExceptionTest {

    @Test(expected = Exception.class)
    public void doesHaveManeErrorTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Тест", feline);
        lion.doesHaveMane();
    }
}
