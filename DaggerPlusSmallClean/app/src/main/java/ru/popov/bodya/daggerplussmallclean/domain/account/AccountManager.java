package ru.popov.bodya.daggerplussmallclean.domain.account;

import ru.popov.bodya.daggerplussmallclean.data.Account;
import ru.popov.bodya.daggerplussmallclean.presentation.login.model.LoginData;
import ru.popov.bodya.daggerplussmallclean.presentation.login.mapper.LoginDataMapper;

/**
 * @author Bogdan Popov
 */
public class AccountManager {

    private LoginDataMapper mLoginDataMapper;

    public AccountManager(LoginDataMapper loginDataMapper) {
        mLoginDataMapper = loginDataMapper;
    }

    public Account mapLoginData(LoginData loginData) {
        return mLoginDataMapper.map(loginData);
    }

}
