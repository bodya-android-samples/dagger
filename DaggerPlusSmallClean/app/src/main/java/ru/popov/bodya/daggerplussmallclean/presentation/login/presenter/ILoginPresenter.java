package ru.popov.bodya.daggerplussmallclean.presentation.login.presenter;

import ru.popov.bodya.daggerplussmallclean.presentation.common.IBasicPresenter;
import ru.popov.bodya.daggerplussmallclean.presentation.login.model.LoginData;
import ru.popov.bodya.daggerplussmallclean.presentation.login.view.ILoginView;

/**
 * @author Bogdan Popov
 */
public interface ILoginPresenter extends IBasicPresenter {

    void loginUser(LoginData loginData);

    void attachView(ILoginView view);
}
