package com.aeo.nativeappnew.tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;

public class Dummy3Test extends BaseTest {

    @Test
    public void dummyTest1() {
        assertEquals(3, 3);
    }

    @Test
    public void dummyTest2() {
        assertFalse(true);
    }
}
