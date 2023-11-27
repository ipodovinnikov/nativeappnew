package com.aeo.nativeappnew.tests;

import com.aeo.nativeappnew.core.DriverManager;
import com.aeo.nativeappnew.test.pages.base.AbstractOnboardingBrandPage;
import com.aeo.nativeappnew.test.pages.base.AbstractOnboardingRealRewardsPage;
import org.springframework.stereotype.Component;
import org.testng.annotations.*;

@Component
public abstract class BaseTest {

    protected final DriverManager driverManager = new DriverManager();
    protected AbstractOnboardingBrandPage onboardingBrandPage = AbstractOnboardingBrandPage.getInstance();
    protected AbstractOnboardingRealRewardsPage onboardingRealRewardsPage = AbstractOnboardingRealRewardsPage.getInstance();

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        driverManager.getDeviceIdsFromConfiguration();
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        driverManager
                .runDevice()
                .createWebDriver();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        driverManager.launchApp();

    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {

    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {

    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {

    }
}
