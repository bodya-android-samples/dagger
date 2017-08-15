package ru.popov.bodya.daggerplussmallclean.di.mapper;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.daggerplussmallclean.presentation.login.model.LoginDataMapper;

/**
 * @author Bogdan Popov
 */
@Module
public class LoginDataMapperModule {

    private static final String TAG = LoginDataMapperModule.class.getSimpleName();

    @Provides
    @Singleton
    LoginDataMapper provideLoginDataMapper() {
        Log.e(TAG, "providing mapLoginData data mapper");
        return new LoginDataMapper();
    }

}
