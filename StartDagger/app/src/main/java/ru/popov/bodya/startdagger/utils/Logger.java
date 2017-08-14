package ru.popov.bodya.startdagger.utils;

import android.util.Log;

/**
 * @author Bogdan Popov
 */
public class Logger {

    public static void logClass(final String tag, Object object) {
        Log.e(tag, String.format("%s: %s", object.getClass().getSimpleName(), object));
    }
}
