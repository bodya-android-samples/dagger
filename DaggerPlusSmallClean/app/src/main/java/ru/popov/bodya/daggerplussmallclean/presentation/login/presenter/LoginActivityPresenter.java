package ru.popov.bodya.daggerplussmallclean.presentation.login.presenter;

import ru.popov.bodya.daggerplussmallclean.domain.account.AccountManager;
import ru.popov.bodya.daggerplussmallclean.data.Account;
import ru.popov.bodya.daggerplussmallclean.presentation.login.model.LoginData;
import ru.popov.bodya.daggerplussmallclean.presentation.login.view.ILoginView;

/**
 * @author Bogdan Popov
 */
public class LoginActivityPresenter implements ILoginPresenter {

    private ILoginView mLoginView;
    private AccountManager mAccountManager;

    public LoginActivityPresenter(AccountManager accountManager) {
        this.mAccountManager = accountManager;
    }

    @Override
    public void loginUser(LoginData loginData) {
        Account account = mAccountManager.mapLoginData(loginData);
        mLoginView.showMailForAccount(account);
    }

    @Override
    public void attachView(ILoginView loginView) {
        mLoginView = loginView;
    }

    @Override
    public void detachView() {
        mLoginView = null;
    }
}
