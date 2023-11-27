package com.aeo.nativeappnew.test.pages.base;

import com.aeo.nativeappnew.test.elements.OnboardingBrandPageElement;
import com.aeo.nativeappnew.test.pages.android.OnboardingBrandPageAndroid;
import com.aeo.nativeappnew.test.pages.ios.OnboardingBrandPageIos;

import static com.aeo.nativeappnew.core.global_data.Constants.Configuration.IS_IOS;

public class AbstractOnboardingBrandPage extends OnboardingBrandPageElement {

    public static AbstractOnboardingBrandPage getInstance() {
        return IS_IOS ? new OnboardingBrandPageIos() : new OnboardingBrandPageAndroid();
    }

    public AbstractOnboardingRealRewardsPage tapShopAe() {
        shopAeButton.click();
        return AbstractOnboardingRealRewardsPage.getInstance();
    }

    public AbstractOnboardingRealRewardsPage tapShopAerie() {
        shopAerieButton.click();
        return AbstractOnboardingRealRewardsPage.getInstance();
    }
}
