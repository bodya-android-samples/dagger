package ru.popov.bodya.daggerplussmallclean.di.login;

import dagger.Subcomponent;
import ru.popov.bodya.daggerplussmallclean.di.common.ActivityScope;
import ru.popov.bodya.daggerplussmallclean.presentation.login.view.LoginActivity;

/**
 * @author Bogdan Popov
 */
@ActivityScope
@Subcomponent(modules = LoginActivityModule.class)
public interface LoginActivityComponent {

    void injectLoginActivity(LoginActivity activity);

}
