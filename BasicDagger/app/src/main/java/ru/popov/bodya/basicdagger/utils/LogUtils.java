package ru.popov.bodya.basicdagger.utils;

import android.util.Log;

import java.util.Locale;

/**
 * @author Popov Bogdan.
 */

public class LogUtils {

    public static void logError(String tag, Object object, String msgFormat) {
        if (object == null) {
            Log.e(tag, msgFormat);
            return;
        }
        Log.e(tag, String.format(Locale.ENGLISH, msgFormat, object));
    }

}
