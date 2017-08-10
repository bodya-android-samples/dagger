package ru.popov.bodya.startdagger.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.startdagger.bean.NetworkUtils;

/**
 * @author Bogdan Popov
 */

@Module
public class NetworkModule {

    @Provides
    NetworkUtils provideNetworkUtils() {
        return new NetworkUtils();
    }
}
