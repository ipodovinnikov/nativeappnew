package com.aeo.nativeappnew.tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class OnboardingDummyTest extends BaseTest {

    @Test
    public void onboardingTest() {
        assertTrue(onboardingBrandPage
                .tapShopAe()
                .isOpen());
    }
}
