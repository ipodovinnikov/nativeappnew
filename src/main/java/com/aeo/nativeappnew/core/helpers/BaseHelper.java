package com.aeo.nativeappnew.core.helpers;

import java.util.function.Function;

import static java.lang.System.getProperty;

public class BaseHelper {

    public static <T> T getSysPropOrDefault(String property, T defaultProp, Function<String, T> function) {
        String prop = getProperty(property);
        return prop == null ? defaultProp : function.apply(prop);
    }

    public static String getStringPropOrDef(String property, String defVal) {
        return getSysPropOrDefault(property, defVal, String::toString);
    }

    public static boolean getBoolPropOrDef(String property, boolean defVal) {
        return getSysPropOrDefault(property, defVal, Boolean::parseBoolean);
    }

    public static int getIntPropOrDef(String property, int defVal) {
        return getSysPropOrDefault(property, defVal, Integer::parseInt);
    }
}
