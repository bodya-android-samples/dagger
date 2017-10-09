package ru.popov.bodya.basicdagger.di;

import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.basicdagger.net.DefaultNetworkApi;
import ru.popov.bodya.basicdagger.net.INetworkApi;
import ru.popov.bodya.basicdagger.net.NetworkApiWrapper;

/**
 * Created by Popov Bogdan.
 */

@Module
public class NetworkModule {

    @Provides
    INetworkApi provideNetworkUtils() {
        return new DefaultNetworkApi();
    }

    @Provides
    NetworkApiWrapper mNetworkApiWrapper(INetworkApi networkApi) {
        return new NetworkApiWrapper(networkApi);
    }
}
