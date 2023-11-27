package com.aeo.nativeappnew.test.pages.base;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.time.Duration;

import static com.aeo.nativeappnew.core.DriverManager.getWebdriver;
import static org.openqa.selenium.support.PageFactory.initElements;

public class BasePage {

    protected BasePage() {
        initElements(new AppiumFieldDecorator(getWebdriver(), Duration.ofSeconds(0)), this);
    }
}
