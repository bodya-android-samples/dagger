package ru.popov.bodya.daggerplussmallclean.di.login;

import android.util.Log;

import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.daggerplussmallclean.business.account.AccountManager;
import ru.popov.bodya.daggerplussmallclean.presentation.login.model.LoginDataMapper;
import ru.popov.bodya.daggerplussmallclean.presentation.login.presenter.ILoginPresenter;
import ru.popov.bodya.daggerplussmallclean.presentation.login.presenter.LoginActivityPresenter;

/**
 * @author Bogdan Popov
 */
@Module
public class LoginActivityModule {

    private static final String TAG = LoginActivityModule.class.getSimpleName();

    @LoginScope
    @Provides
    LoginDataMapper provideLoginDataMapper() {
        Log.e(TAG, "providing mapLoginData data mapper");
        return new LoginDataMapper();
    }

    @LoginScope
    @Provides
    AccountManager provideAccountManager(LoginDataMapper loginDataMapper) {
        return new AccountManager(loginDataMapper);
    }

    @LoginScope
    @Provides
    ILoginPresenter provideLoginActivityPresenter(AccountManager accountManager) {
        return new LoginActivityPresenter(accountManager);
    }


}
