package ru.popov.bodya.startdagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import ru.popov.bodya.startdagger.bean.DatabaseHelper;
import ru.popov.bodya.startdagger.bean.NetworkUtils;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    DatabaseHelper mDatabaseHelper;
    NetworkUtils mNetworkUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Application app = (Application) getApplication();
        mDatabaseHelper = app.getAppComponent().getDatabaseHelper();
        mNetworkUtils = app.getAppComponent().getNetworkUtils();

        Log.e(TAG, "databaseHelper: " + mDatabaseHelper.getClass().getName());
        Log.e(TAG, "networkUtils: " + mNetworkUtils.getClass().getName());
    }
}
