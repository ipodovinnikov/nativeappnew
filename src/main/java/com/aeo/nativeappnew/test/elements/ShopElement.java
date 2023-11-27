package com.aeo.nativeappnew.test.elements;

import com.aeo.nativeappnew.test.pages.base.BasePage;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;

import static com.aeo.nativeappnew.core.global_data.Constants.WebElements.*;

public abstract class ShopElement extends BasePage {

    @AndroidFindAll({
            @AndroidBy(xpath = VIEW_GROUP + "[@resource-id='" + ID + "toolbar']" + TEXT_VIEW + "[@text='Shop']"),
            @AndroidBy(xpath = VIEW_GROUP + "[@resource-id='" + ID + "toolbar']" + TEXT_VIEW + "[contains(@text,'Magasiner')]"),
            @AndroidBy(xpath = VIEW_GROUP + "[@resource-id='" + ID + "toolbar']" + TEXT_VIEW + "[@text='Comprar']"),
            @AndroidBy(xpath = TEXT_VIEW + "[@text = 'Shop AE' or @text = 'Shop Aerie']"),
            @AndroidBy(xpath = TEXT_VIEW + "[@text = 'Comprar AE' or @text = 'Comprar Aerie']"),
            @AndroidBy(xpath = TEXT_VIEW + "[@text = 'Magasiner AE' or @text = 'Magasiner Aerie']")
    })
    protected WebElement hdrShop;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'camera barcode'")
    @AndroidFindBy(xpath = TEXT_VIEW + "[@resource-id='" + ID + "snap_scan_header_layout_title_label']")
    public WebElement btnSnapAndScan;

    @iOSXCUITFindBy(accessibility = "AmericanEagle.TopMenuView")
    @AndroidFindAll({
            @AndroidBy(xpath = TEXT_VIEW + "[@text='Shop']"),
            @AndroidBy(xpath = TEXT_VIEW + "[@text='SHOP']")
    })
    protected WebElement lblShopPage;

    @iOSXCUITFindAll({
            @iOSXCUITBy(iOSNsPredicate = "label == 'big loupe'"),
            @iOSXCUITBy(accessibility = "TopMenu/loupe")
    })
    @AndroidFindBy(id = "action_search")
    protected WebElement btnSearch;

    @AndroidFindAll({
            @AndroidBy(accessibility = "Show menu"),
            @AndroidBy(accessibility = "Hide menu"),
            @AndroidBy(accessibility = "Afficher le menu"),
            @AndroidBy(accessibility = "Mostrar menú")
    })
    protected WebElement btnMenuHamburger;

    @AndroidFindAll({
            @AndroidBy(id = "Show menu"),
            @AndroidBy(xpath = IMAGE_BUTTON + "[@content-desc='Show menu']"),
            @AndroidBy(xpath = IMAGE_BUTTON + "[@content-desc='Afficher le menu']"),
            @AndroidBy(xpath = IMAGE_BUTTON + "[@content-desc='Mostrar menú']")
    })
    protected WebElement btnShowMenu;

    @iOSXCUITFindBy(accessibility = "BrandingCardViewBigImageID")
    @AndroidFindBy(id = "brand_card_imageView")
    protected WebElement imgBrandingCard;

    @iOSXCUITFindBy(accessibility = "BrandingCardViewHeadlineLabelID")
    @AndroidFindBy(id = "header")
    protected WebElement txtBrandingCardHeader;

    @iOSXCUITFindBy(accessibility = "BrandingCardViewPromoShopNowButtonID")
    @AndroidFindBy(id = "brand_card_primary_card")
    protected WebElement btnBrandingCardShopNow;

    @iOSXCUITFindBy(accessibility = "BrandingCardViewSubHeadlineLabelID")
    @AndroidFindBy(id = "marketing_message")
    protected WebElement txtBrandingCardSubheader;

    @iOSXCUITFindBy(accessibility = "BrandingCardViewPromoCodeButtonID")
    @AndroidFindBy(id = ID + "use_code_text")
    protected WebElement btnBrandingCardPromoCode;

    @iOSXCUITFindBy(accessibility = "BrandingCardViewDetailsButtonID")
    @AndroidFindBy(id = ID + "details_text")
    protected WebElement btnBrandingCardDetails;

    @iOSXCUITFindBy(accessibility = "openStoreLocatorButtonID")
    protected WebElement btnFindStore;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'tabBar.button.myAEO'")
    protected WebElement btnMyAeo;

    @iOSXCUITFindAll({
            @iOSXCUITBy(iOSNsPredicate = "name == 'tabBar.button.bag'"),
            @iOSXCUITBy(accessibility = "Bag"),
            @iOSXCUITBy(accessibility = "My Bag"),
            @iOSXCUITBy(iOSNsPredicate = "label == 'Mon panier' OR name == 'Mon panier'"),
            @iOSXCUITBy(accessibility = "tabBar.button.bag"),
    })
    @AndroidFindAll({
            @AndroidBy(id = "shoppingBagImageView"),
            @AndroidBy(id = "bagImageView"),
            @AndroidBy(id = "bagcount")
    })
    protected WebElement btnMyBag;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Return to Scan & Pay'")
    protected WebElement btnReturnScanAndPay;

    @iOSXCUITFindAll({
            @iOSXCUITBy(iOSNsPredicate = "name == 'tabBar.button.bag'"),
            @iOSXCUITBy(iOSNsPredicate = "name == 'My Bag' || name == 'Bag' AND type == 'XCUIElementTypeButton'")
    })
    @AndroidFindBy(id = "bagcount")
    protected WebElement btnBagCount;

    @AndroidFindBy(id = "header")
    protected WebElement header;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'NoSearchResultsViewDescriptionLabelId' AND type == 'XCUIElementTypeStaticText'")
    @AndroidFindBy(xpath = TEXT_VIEW + "[@resource-id='" + ID + "tip_text']")
    protected WebElement lblNothingFound;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Account Created Successfully' AND type == 'XCUIElementTypeStaticText'")
    protected WebElement lblAccountCreated;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'OK' AND type == 'XCUIElementTypeButton'")
    protected WebElement btnOkPopup;

    @AndroidFindBy(id = "action_favorite")
    @iOSXCUITFindAll({
            @iOSXCUITBy(accessibility = "tabBar.button.favorites"),
            @iOSXCUITBy(iOSNsPredicate = "label == 'Favorites' OR name == 'Favorites'"),
            @iOSXCUITBy(iOSNsPredicate = "label == 'Favoris' OR name == 'Favoris'"),
            @iOSXCUITBy(iOSNsPredicate = "name == 'tabBar.button.favorites'")
    })
    protected WebElement btnFavorites;

    @iOSXCUITFindAll({
            @iOSXCUITBy(accessibility = "Back"),
            @iOSXCUITBy(accessibility = "Cancel"),
            @iOSXCUITBy(iOSNsPredicate = "name == 'arrow left'"),
            @iOSXCUITBy(iOSNsPredicate = "name == 'Cancel'"),
            @iOSXCUITBy(iOSNsPredicate = "name == 'cross'")
    })
    @AndroidFindAll({
            @AndroidBy(xpath = IMAGE_BUTTON + "[@content-desc='Navigate up']"),
            @AndroidBy(id = "back_button"),
            @AndroidBy(xpath = IMAGE_VIEW + "[@resource-id='" + ID + "backbutton']"),
            @AndroidBy(id = "fragment_pdp_back_button"),
            @AndroidBy(xpath = IMAGE_VIEW + "[@resource-id='" + ID + "back_image']"),
            @AndroidBy(xpath = IMAGE_VIEW + "[contains(@resource-id, 'up')]"),
            @AndroidBy(xpath = IMAGE_BUTTON + "[@content-desc='Desplazarse hacia arriba']"),
            @AndroidBy(xpath = ANDROID_VIEW + "[@content-desc='empty_bag_icon']/parent::android.view.View/android.view.View[1]/android.widget.Button[1]"),
            @AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[4]/android.widget.Button[1]") // We should use this locator until MOB-58272 is not resolved
    })
    protected WebElement btnBackCancel;

    @iOSXCUITFindBy(iOSNsPredicate = "name = 'tabBar.button.shop'")
    protected WebElement btnShop;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Inspiration' OR name == 'Inspiration'")
    @AndroidFindBy(xpath = TEXT_VIEW + "[@text='Inspiration']")
    protected WebElement btnInspiration;

    @iOSXCUITFindBy(accessibility = "LoyaltyStatusEmptyViewLabelID")
    protected WebElement lblLoyWidgetStatus;

    @iOSXCUITFindBy(accessibility = "LEARN MORE")
    protected WebElement btnLoyaltyLearnMore;

    @iOSXCUITFindBy(accessibility = "SIGN IN")
    protected WebElement btnLoyaltySignIn;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'VIEW ACCOUNT' AND label == 'VIEW ACCOUNT'")
    protected WebElement btnLoyaltyViewAccount;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'stateLabelId'")
    protected WebElement txtLoyaltyDescription;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'ENROLL NOW'")
    protected WebElement btnLoyaltyEnrollNow;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'pointsLabelId'")
    protected WebElement lblPointsCount;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'Ring progress'")
    protected WebElement lblRingProgress;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'loyaltyStatusRefreshViewLabelID'")
    protected WebElement lblSoftAuthTime;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'loyaltyStatusRefreshViewButtonID'")
    protected WebElement btnLoyaltyRefresh;

    @iOSXCUITFindAll({
            @iOSXCUITBy(iOSNsPredicate = "label CONTAINS \"We're working on your order now.\" AND type == 'XCUIElementTypeStaticText'"),
            @iOSXCUITBy(iOSNsPredicate = "label CONTAINS 'Get excited! Your order is in the works.' AND type == 'XCUIElementTypeStaticText'"),
            @iOSXCUITBy(iOSNsPredicate = "label CONTAINS 'Your order shipped!' AND type == 'XCUIElementTypeStaticText'"),
            @iOSXCUITBy(iOSNsPredicate = "label CONTAINS 'Part of your order shipped!' AND type == 'XCUIElementTypeStaticText'"),
            @iOSXCUITBy(iOSNsPredicate = "label CONTAINS 'Your order was delivered!' AND type == 'XCUIElementTypeStaticText'"),
            @iOSXCUITBy(iOSNsPredicate = "label CONTAINS 'Sorry, your order has been canceled.' AND type == 'XCUIElementTypeStaticText'")
    })
    @AndroidFindBy(xpath = VIEW_GROUP + "[@resource-id='" + ID + "shipping_banner_item']" + TEXT_VIEW + "[@resource-id='" + ID + "app_version']")
    protected WebElement lblOrderWidget;

    @AndroidFindBy(id = "app_version")
    @iOSXCUITFindBy(iOSNsPredicate = "name = 'orderStatusLabelId'")
    protected WebElement txtOrderWidgetDescription;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"cross\"`]")
    @AndroidFindBy(id = "close_catalog_shipping_banner_button")
    protected WebElement btnCurbsideWidgetCloseIcon;

    @AndroidFindBy(xpath = VIEW_GROUP + "[@resource-id='" + ID + "shipping_banner_item']" + ANDROID_VIEW + "[@resource-id='" + ID + "container']")
    protected WebElement orderWidgetContainer;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'shippingBannerLabelId'")
    @AndroidFindBy(id = "holiday_notification_bar")
    protected WebElement txtShippingBanner;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'SelfCheckoutTopMenuCell'")
    protected WebElement cellSelfCheckoutWidget;

    @iOSXCUITFindBy(accessibility = "Settings")
    protected WebElement btnSettings;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'AlertControllerDescriptionId'")
    protected WebElement txtSettingsLocation;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'SelfCheckoutTopMenuCellTitle'")
    protected WebElement lblSelfCheckoutWelcomeMessage;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"SelfCheckoutTopMenuCellButton\"`]")
    protected WebElement btnSelfCheckout;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'SelfCheckoutTopMenuCellButton'")
    protected WebElement btnContinueSelfCheckout;

    @iOSXCUITFindBy(iOSNsPredicate = "label CONTAINS 'Scanned products will be transferred'")
    protected WebElement txtBagConversionMessage;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Return to Scan & Pay'")
    protected WebElement btnReturnToSelfCheckout;

    @iOSXCUITFindBy(iOSNsPredicate = "label == 'End Scan & Pay Session'")
    protected WebElement btnEndSelfCheckoutSession;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'Cancel'")
    protected WebElement btnCancelBagConversion;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"We’ll have your order ready for you at the store!\" OR value == \"We’ll have your order ready for you at the store!\" OR name == \"We’ll have your order ready for you at the store!\"")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"We’ll have your order ready for you at the store!\"`]")
    @AndroidFindBy(xpath = TEXT_VIEW + "[@text='We’ll have your order ready for you at the store!']")
    protected WebElement txtReadyForPickupInStore;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"We can't wait to see you! Let us know when you’re coming.\" OR value == \"We can't wait to see you! Let us know when you’re coming.\" OR name == \"We can't wait to see you! Let us know when you’re coming.\"")
    @iOSXCUITFindBy(iOSClassChain = "**/*[`label == \"We can't wait to see you! Let us know when you’re coming.\"`]")
    @AndroidFindBy(xpath = TEXT_VIEW + "[@text='We can’t wait to see you! Let us know when you’re coming.']")
    protected WebElement txtCurbsidePickupMethod;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"We'll bring your Curbside Pickup order to you when you arrive.\" OR value == \"We'll bring your Curbside Pickup order to you when you arrive.\" OR name == \"We'll bring your Curbside Pickup order to you when you arrive.\"")
    @iOSXCUITFindBy(iOSClassChain = "**/*[`label == \"We'll bring your Curbside Pickup order to you when you arrive.\"`]")
    @AndroidFindBy(xpath = TEXT_VIEW + "[@text='We’ll bring your Curbside Pickup order to you when you arrive.']")
    protected WebElement txtVehicleDetails;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'CHOOSE PICKUP METHOD' OR label == 'CHOOSE PICKUP METHOD' OR value == 'CHOOSE PICKUP METHOD'")
    @AndroidFindBy(xpath = TYPE_BUTTON + "[@text='CHOOSE PICKUP METHOD']")
    protected WebElement btnChoosePickUpMethod;

    @iOSXCUITFindAll({
            @iOSXCUITBy(iOSNsPredicate = "value = \"I'M ON THE WAY!\" or name = \"I'M ON THE WAY!\" or label = \"I'M ON THE WAY!\""),
            @iOSXCUITBy(iOSNsPredicate = "value = 'CHOOSE PICKUP METHOD' or name = 'CHOOSE PICKUP METHOD' or label = 'CHOOSE PICKUP METHOD'"),
            @iOSXCUITBy(iOSNsPredicate = "name == \"VIEW PICKUP DETAILS\" OR value == \"VIEW PICKUP DETAILS\" OR label == \"VIEW PICKUP DETAILS\""),
            @iOSXCUITBy(accessibility = "geoFenceShopWidgetView.buttonId")
    })
    @AndroidFindBy(id = "btn_pick_up_action")
    protected WebElement btnCurbsideWidget;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"GIVE FEEDBACK\"`]")
    @AndroidFindBy(xpath = TYPE_BUTTON + "[@text='GIVE FEEDBACK']")
    protected WebElement btnGiveFeedback;
}
