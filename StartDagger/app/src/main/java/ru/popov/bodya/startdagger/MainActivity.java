package ru.popov.bodya.startdagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import ru.popov.bodya.startdagger.bean.DatabaseHelper;
import ru.popov.bodya.startdagger.bean.NetworkUtils;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    DatabaseHelper mInjectedDatabaseHelper;

    @Inject
    NetworkUtils mInjectedNetworkUtils;

    private DatabaseHelper mDatabaseHelper;
    private NetworkUtils mNetworkUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Application app = (Application) getApplication();
        mDatabaseHelper = app.getAppComponent().getDatabaseHelper();
        mNetworkUtils = app.getAppComponent().getNetworkUtils();

        Log.e(TAG, "databaseHelper: " + mDatabaseHelper);
        Log.e(TAG, "networkUtils: " + mNetworkUtils);

        app.getInjectAppComponent().injectsMainActivity(this);

        Log.e(TAG, "injectedDatabaseHelper: " + mInjectedDatabaseHelper);
        Log.e(TAG, "injectedNetworkUtils: " + mInjectedNetworkUtils);
    }
}
