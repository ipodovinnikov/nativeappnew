package com.aeo.nativeappnew.tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Dummy2Test extends BaseTest {

    @Test
    public void dummyTest1() {
        assertEquals(2, 2);
    }

    @Test
    public void dummyTest2() {
        assertTrue(true);
    }
}

