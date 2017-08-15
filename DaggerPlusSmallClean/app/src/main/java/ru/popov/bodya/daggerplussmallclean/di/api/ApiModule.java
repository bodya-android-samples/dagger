package ru.popov.bodya.daggerplussmallclean.di.api;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.daggerplussmallclean.business.api.ApiService;

/**
 * @author Bogdan Popov
 */
@Module
public class ApiModule {

    private static final String TAG = ApiModule.class.getSimpleName();

    @Provides
    @Singleton
    ApiService provideApiService() {
        Log.e(TAG, "providing new API service");
        return new ApiService();
    }


}
