package com.aeo.nativeappnew.tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class Dummy1Test extends BaseTest {

    @Test
    public void dummyTest1() {
        assertEquals(2, 3);
    }

    @Test
    public void dummyTest2() {
        assertFalse(true);
    }

    @Test
    public void onboardingTest() {
        onboardingBrandPage.tapShopAe();
        assertTrue(onboardingRealRewardsPage.isOpen());
    }
}
