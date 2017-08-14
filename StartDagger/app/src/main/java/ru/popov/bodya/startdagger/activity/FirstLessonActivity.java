package ru.popov.bodya.startdagger.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import ru.popov.bodya.startdagger.Application;
import ru.popov.bodya.startdagger.R;
import ru.popov.bodya.startdagger.model.bean.DatabaseHelper;
import ru.popov.bodya.startdagger.model.bean.NetworkUtils;
import ru.popov.bodya.startdagger.di.qualifier.ReleaseDatabaseHelper;

import static ru.popov.bodya.startdagger.utils.Logger.logClass;

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
        logClass(TAG, databaseHelper);

        NetworkUtils networkUtils1 = app.getAppComponent().getNetworkUtils();
        logClass(TAG, networkUtils1);

        NetworkUtils networkUtils2 = app.getAppComponent().getNetworkUtils();
        logClass(TAG, networkUtils2);

        app.getInjectAppComponent().injectsFirstLessonActivity(this);

        logClass(TAG, mInjectedDatabaseHelper);
        logClass(TAG, mInjectedNetworkUtils);
    }
}
