package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
public class FelineTest {


    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(11);
        Assert.assertEquals(11, actual);
    }

    @Test
    public void getKittensWithoutParametersTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        Assert.assertEquals(1, actual);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        Assert.assertEquals("Кошачьи", actual);
    }

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }
}