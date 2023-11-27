package com.aeo.nativeappnew.test.pages.base;

import com.aeo.nativeappnew.test.elements.OnboardingRealRewardsPageElement;
import com.aeo.nativeappnew.test.pages.android.OnboardingRealRewardsPageAndroid;
import com.aeo.nativeappnew.test.pages.ios.OnboardingRealRewardsPageIos;

import static com.aeo.nativeappnew.core.global_data.Constants.Configuration.IS_IOS;

public class AbstractOnboardingRealRewardsPage extends OnboardingRealRewardsPageElement {

    public static AbstractOnboardingRealRewardsPage getInstance() {
        return IS_IOS ? new OnboardingRealRewardsPageIos() : new OnboardingRealRewardsPageAndroid();
    }

    public boolean isOpen() {
        return realRewardsTitle.isDisplayed();
    }
}
