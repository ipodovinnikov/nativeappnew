package com.aeo.nativeappnew.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import static com.aeo.nativeappnew.core.global_data.Constants.Configuration.IS_IOS;
import static com.aeo.nativeappnew.core.global_data.Constants.Devices.*;
import static java.lang.System.getProperty;

@Component
public class DriverManager {

    private final ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();
    private static final Map<Thread, WebDriver> driverStorage = new HashMap<>();
    public static final String PATH_TO_APP = IS_IOS ? "/Users/ipodovinnikov/Downloads/AmericanEagle_13.8.0-2880-24A-Develop_Simulator.app" :
            "/Users/ipodovinnikov/Downloads/androidAEO-prod-debug - 2023-09-19T154204.321.apk";
    private static final LinkedList<String> deviceIds = new LinkedList<>();
    private final ConcurrentMap<Thread, String> threadDeviceMap = new ConcurrentHashMap<>();

    public synchronized void createWebDriver() {
        AppiumDriver driver = IS_IOS ? new IOSDriver(getIosOptions()) :
                new AndroidDriver(getAndroidOptions());
        driverStorage.put(Thread.currentThread(), driver);
        webDriverThreadLocal.set(driver);
    }

    public static synchronized WebDriver getWebdriver() {
        return driverStorage.get(Thread.currentThread());
    }

    public XCUITestOptions getIosOptions() {

        var udid = threadDeviceMap.get(Thread.currentThread());

        XCUITestOptions options = new XCUITestOptions();
        options.setBundleId(IOS_APP_ID);
        options.setApp(PATH_TO_APP);
        options.setPlatformName(IOS);
        options.setAutomationName("XCUITest");
        options.setUdid(udid);
        options.setAutoAcceptAlerts(true);

        return options;
    }

    public UiAutomator2Options getAndroidOptions() {

        var udid = threadDeviceMap.get(Thread.currentThread());

        UiAutomator2Options options = new UiAutomator2Options();
        options.setAppActivity(ANDROID_APP_ID);
        options.setApp(PATH_TO_APP);
        options.setPlatformName(ANDROID);
        options.setAutomationName("uiautomator2");
        options.setUdid(udid);

        return options;
    }

    public void getDeviceIdsFromConfiguration() {
        deviceIds.addAll(Arrays.asList(getProperty(EMULATORS).split(",")));
    }

    @SneakyThrows
    public synchronized DriverManager runDevice() {
        var udid = deviceIds.get(0);
        threadDeviceMap.put(Thread.currentThread(), udid);
        deviceIds.remove(0);
        try {
            String[] args;
            if (IS_IOS) {
                args = new String[]{"xcrun", "simctl", "boot", udid};
                new ProcessBuilder(args).start();
                args = new String[]{"open", "-a", "Simulator", udid};
                new ProcessBuilder(args).start();
                System.out.println("Device " + udid + " started with Thread " + Thread.currentThread().getName());
                Thread.sleep(10000);
            } else {
                args = null;
                new ProcessBuilder(args).start();
            }
        } catch (IOException e) {

        }
        return this;
    }

    @SneakyThrows
    public synchronized DriverManager launchApp() {
        var udid = threadDeviceMap.get(Thread.currentThread());
        try {
            String[] args;
            if (IS_IOS) {
                args = new String[]{"xcrun", "simctl", "launch", udid, IOS_APP_ID};
                new ProcessBuilder(args).start();
                Thread.sleep(60000);
            } else {
                args = null;
                new ProcessBuilder(args).start();
            }
        } catch (IOException e) {

        }
        return this;
    }
}
