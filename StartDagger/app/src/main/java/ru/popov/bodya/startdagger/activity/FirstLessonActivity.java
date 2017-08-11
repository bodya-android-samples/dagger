package ru.popov.bodya.startdagger.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import ru.popov.bodya.startdagger.Application;
import ru.popov.bodya.startdagger.R;
import ru.popov.bodya.startdagger.model.bean.DatabaseHelper;
import ru.popov.bodya.startdagger.model.bean.NetworkUtils;
import ru.popov.bodya.startdagger.di.qualifier.ReleaseDatabaseHelper;

/**
 * @author Bogdan Popov
 */

public class FirstLessonActivity extends AppCompatActivity {

    private static final String TAG = FirstLessonActivity.class.getSimpleName();

    @ReleaseDatabaseHelper
    @Inject
    DatabaseHelper mInjectedDatabaseHelper;

    @Inject
    NetworkUtils mInjectedNetworkUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity_main);

        Application app = (Application) getApplication();
        DatabaseHelper databaseHelper = app.getAppComponent().getTestDatabaseHelper();
        NetworkUtils networkUtils = app.getAppComponent().getNetworkUtils();

        Log.e(TAG, "databaseHelper: " + databaseHelper);
        Log.e(TAG, "networkUtils: " + networkUtils);

        app.getInjectAppComponent().injectsFirstLessonActivity(this);

        Log.e(TAG, "injectedDatabaseHelper with test: " + mInjectedDatabaseHelper);
        Log.e(TAG, "injectedNetworkUtils: " + mInjectedNetworkUtils);
    }
}
