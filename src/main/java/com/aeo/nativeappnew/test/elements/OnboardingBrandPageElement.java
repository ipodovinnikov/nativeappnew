package com.aeo.nativeappnew.test.elements;

import com.aeo.nativeappnew.test.pages.base.BasePage;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class OnboardingBrandPageElement extends BasePage {

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'OnboardingShopButtonAmericanEagleID'")
    protected WebElement shopAeButton;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'OnboardingShopButtonAerieID'")
    protected WebElement shopAerieButton;
}
