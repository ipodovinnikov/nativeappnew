package com.aeo.nativeappnew.core.global_data;

import lombok.experimental.UtilityClass;

import static com.aeo.nativeappnew.core.global_data.Constants.Devices.IOS;
import static com.aeo.nativeappnew.core.global_data.Constants.Devices.PLATFORM;
import static com.aeo.nativeappnew.core.helpers.BaseHelper.getStringPropOrDef;

@UtilityClass
public class Constants {

    public static final class WebElements {
        public static final String ID = "com.ae.ae.debug:id/";
        public static final String SCROLL_VIEW = "//android.widget.ScrollView";
        public static final String TEXT_VIEW = "//android.widget.TextView";
        public static final String LIST_VIEW = "//android.widget.ListView";
        public static final String GRID_VIEW = "//android.widget.GridView";
        public static final String EDIT_TEXT = "//android.widget.EditText";
        public static final String FRAME_LAYOUT = "//android.widget.FrameLayout";
        public static final String IMAGE_VIEW = "//android.widget.ImageView";
        public static final String IMAGE_BUTTON = "//android.widget.ImageButton";
        public static final String TYPE_BUTTON = "//android.widget.Button";
        public static final String RADIO_BUTTON = "//android.widget.RadioButton";
        public static final String TYPE_CHECKBOX = "//android.widget.CheckBox";
        public static final String TXT_INPUT_LAYOUT = "//TextInputLayout";
        public static final String RELATIVE_LAYOUT = "//android.widget.RelativeLayout";
        public static final String LINEAR_LAYOUT = "//android.widget.LinearLayout";
        public static final String PROGRESS_BAR = "//android.widget.ProgressBar";
        public static final String VIEW_GROUP = "//android.view.ViewGroup";
        public static final String NUMBER_PICKER = "//android.widget.NumberPicker";
        public static final String ANDROID_VIEW = "//android.view.View";
        public static final String ANDROID_IMAGE = "//android.widget.Image";
        public static final String ANDROID_MULTI_AUTO_COMPLETE_TEXT_VIEW = "//android.widget.MultiAutoCompleteTextView";
        public static final String RECYCLER_VIEW = "//androidx.recyclerview.widget.RecyclerView";
        public static final String SWITCH_TOGGLE = "//android.widget.Switch";
        public static final String HORIZONTAL_VIEW = "//android.widget.HorizontalScrollView";
        public static final String ACTIONBAR_TAB = "//*[contains(@class,'android.support.v7.app.ActionBar') " +
                "and contains(@class,'Tab')]";
        public static final String ACTION_BAR_TAB = "//androidx.appcompat.app.ActionBar.Tab";
        public static final String LINEAR_LAYOUT_COMPAT = "//androidx.appcompat.widget.LinearLayoutCompat";
        public static final String FOCUSED_FIELD = "//*[@focused='true']";
        public static final String IOS_CELL = "//XCUIElementTypeCell";
        public static final String IOS_STATIC_TEXT = "//XCUIElementTypeStaticText";
        public static final String IOS_STATIC_TEXT_FOR_CLASS_CHAIN = "**/XCUIElementTypeStaticText";
        public static final String IOS_TYPE_BUTTON_FOR_CLASS_CHAIN = "**/XCUIElementTypeButton";
        public static final String IOS_TEXT_VIEW = "//XCUIElementTypeTextView";
        public static final String IOS_TABLE = "//XCUIElementTypeTable";
        public static final String IOS_TEXT_FIELD = "//XCUIElementTypeTextField";
        public static final String IOS_BUTTON = "//XCUIElementTypeButton";
        public static final String IOS_OTHER = "//XCUIElementTypeOther";
        public static final String IOS_SCROLL_VIEW = "//XCUIElementTypeScrollView";
        public static final String IOS_IMAGE = "//XCUIElementTypeImage";
        public static final String IOS_SWITCH = "//XCUIElementTypeSwitch";
        public static final String IOS_NAV_BAR = "//XCUIElementTypeNavigationBar";
        public static final String IOS_COLLECTION_VIEW = "//XCUIElementTypeCollectionView";
        public static final String IOS_STATUS_BAR = "//XCUIElementTypeStatusBar";
    }

    @UtilityClass
    public static final class Configuration {
        public static final String TEST_PLATFORM = getStringPropOrDef(PLATFORM, IOS).toLowerCase();
        public static final boolean IS_IOS = TEST_PLATFORM.equals(IOS);
    }

    @UtilityClass
    public static final class Devices {
        public static final String IOS = "ios";
        public static final String ANDROID = "android";
        public static final String PLATFORM = "platform";
        public static final String EMULATORS = "emulators";
        public static final String ANDROID_APP_ID = "com.ae.ae.debug";
        public static final String IOS_APP_ID = "com.ae.uat";
        public static final String PORTS = "ports";
    }
}
