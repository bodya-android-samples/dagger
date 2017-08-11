package ru.popov.bodya.startdagger.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Set;

import javax.inject.Inject;

import dagger.Lazy;
import ru.popov.bodya.startdagger.Application;
import ru.popov.bodya.startdagger.model.EventHandler;
import ru.popov.bodya.startdagger.model.bean.DatabaseHelper;
import ru.popov.bodya.startdagger.di.qualifier.TestDatabaseHelper;

/**
 * @author Bogdan Popov
 */


public class SecondLessonActivity extends AppCompatActivity {

    private static final String TAG = SecondLessonActivity.class.getSimpleName();

    @Inject
    @TestDatabaseHelper
    Lazy<DatabaseHelper> mDatabaseUtilsProvider;

    @Inject
    Set<EventHandler> mEventHandlers;

    private DatabaseHelper mTestDatabaseHelper;
    private DatabaseHelper mReleaseDatabaseHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Application app = (Application) getApplication();
        app.getInjectAppComponent().injectsSecondLessonActivity(this);

        Log.e(TAG, "provider: " + mDatabaseUtilsProvider.toString());
        DatabaseHelper databaseHelper1 = mDatabaseUtilsProvider.get();
        DatabaseHelper databaseHelper2 = mDatabaseUtilsProvider.get();
        Log.e(TAG, "helper1: " + databaseHelper1);
        Log.e(TAG, "helper2: " + databaseHelper2);


        mTestDatabaseHelper = app.getAppComponent().getTestDatabaseHelper();
        mReleaseDatabaseHelper = app.getAppComponent().getReleaseDatabaseHelper();

        Log.e(TAG, "test database helper: " + mTestDatabaseHelper);
        Log.e(TAG, "release database helper: " + mReleaseDatabaseHelper);

        Log.e(TAG, "mEventHandlers size: " + mEventHandlers.size());
    }
}
