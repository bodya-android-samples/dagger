package ru.popov.bodya.daggerplussmallclean.di.api;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.daggerplussmallclean.business.api.ApiService;

@Module
public class ApiModule {

    @Provides
    @Singleton
    public ApiService provideApiService() {
        Log.d("qweee", "new apiservice");
        return new ApiService();
    }


}
