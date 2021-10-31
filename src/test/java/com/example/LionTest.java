package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionTest {

    @Test
    public void getKittensTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        Assert.assertEquals(1, actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }
}
