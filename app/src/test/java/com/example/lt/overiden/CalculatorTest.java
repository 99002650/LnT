package com.example.lt.overiden;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
   public  void test_add(){
        int expected = 30;
        int actual = Calculator.add(10,20);
        assertEquals(expected,actual);
    }

    @Test
    public void test_add_negative(){
        int expected = -40;
        int actual = Calculator.add(-10,-20);
        assertNotEquals(expected,actual);
    }

}