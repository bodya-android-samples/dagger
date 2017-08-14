package ru.popov.bodya.startdagger.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Lazy;
import ru.popov.bodya.startdagger.Application;
import ru.popov.bodya.startdagger.di.component.AppComponent;
import ru.popov.bodya.startdagger.di.component.ChildComponent;
import ru.popov.bodya.startdagger.model.EventHandler;
import ru.popov.bodya.startdagger.model.bean.DatabaseHelper;
import ru.popov.bodya.startdagger.di.qualifier.TestDatabaseHelper;
import ru.popov.bodya.startdagger.model.bean.NetworkUtils;
import ru.popov.bodya.startdagger.utils.Logger;

import static ru.popov.bodya.startdagger.utils.Logger.logClass;

/**
 * @author Bogdan Popov
 */
public class SecondLessonActivity extends AppCompatActivity {

    private static final String TAG = SecondLessonActivity.class.getSimpleName();
    private static final String ELEMENTS_INTO_SET = "elements_into_set";
    private static final String INTO_SET = "into_set";

    @Inject
    @TestDatabaseHelper
    Lazy<DatabaseHelper> mDatabaseUtilsProvider;

    @Inject
    @Named(ELEMENTS_INTO_SET)
    Set<EventHandler> mEventHandlers;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Application app = (Application) getApplication();
        app.getInjectAppComponent().injectsSecondLessonActivity(this);

        AppComponent appComponent = app.getAppComponent();
        ChildComponent childComponent = appComponent.createChildComponent();

        logClass(TAG, mDatabaseUtilsProvider);
        DatabaseHelper databaseHelper1 = mDatabaseUtilsProvider.get();
        DatabaseHelper databaseHelper2 = mDatabaseUtilsProvider.get();
        logClass(TAG, databaseHelper1);
        logClass(TAG, databaseHelper2);

        DatabaseHelper testDatabaseHelper = childComponent.getTestDatabaseHelper();
        DatabaseHelper releaseDatabaseHelper = childComponent.getReleaseDatabaseHelper();

        logClass(TAG, testDatabaseHelper);
        logClass(TAG, releaseDatabaseHelper);
        Log.e(TAG, "mEventHandlers size: " + mEventHandlers.size());


        NetworkUtils networkUtils = childComponent.getNetworkUtils();
        logClass(TAG, networkUtils);
    }
}
