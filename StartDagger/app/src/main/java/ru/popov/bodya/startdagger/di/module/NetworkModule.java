package ru.popov.bodya.startdagger.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.startdagger.model.bean.NetworkUtils;

/**
 * @author Bogdan Popov
 */
@Module
public class NetworkModule {

    @Singleton
    @Provides
    NetworkUtils provideNetworkUtils() {
        return new NetworkUtils();
    }
}
