package com.example.xwh.myapplication;


import org.junit.Test;

import static junit.framework.Assert.*;

public class JavaTest {

    @Test
    public void test() {
        String a;
        assertEquals("a", (a = "a"));
        System.out.println(a);
    }


}
