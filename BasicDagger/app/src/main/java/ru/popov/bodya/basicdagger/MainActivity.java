package ru.popov.bodya.basicdagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Named;

import ru.popov.bodya.basicdagger.di.Names;
import ru.popov.bodya.basicdagger.net.INetworkApi;
import ru.popov.bodya.basicdagger.net.NetworkApiWrapper;
import ru.popov.bodya.basicdagger.storage.IUserRepository;
import ru.popov.bodya.basicdagger.utils.LogUtils;

/**
 * @author Popov Bogdan
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    IUserRepository mUserRepository;

    @Named(Names.BACKEND_API)
    @Inject
    INetworkApi mNetworkApi;

    @Inject
    NetworkApiWrapper mNetworkApiWrapper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponent appComponent = ((IHasComponent<AppComponent>) getApplication()).getComponent();
        appComponent.injectsMainActivity(this);

        LogUtils.logError(TAG, mUserRepository, getString(R.string.msg_format));
        LogUtils.logError(TAG, mNetworkApi, getString(R.string.msg_format));
        LogUtils.logError(TAG, mNetworkApiWrapper, getString(R.string.msg_format));
        LogUtils.logError(TAG, mNetworkApiWrapper.getINetworkApi(), getString(R.string.msg_format));
    }
}
