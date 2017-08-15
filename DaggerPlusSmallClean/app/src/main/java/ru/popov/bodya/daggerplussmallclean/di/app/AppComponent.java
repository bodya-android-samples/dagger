package ru.popov.bodya.daggerplussmallclean.di.app;

import javax.inject.Singleton;

import dagger.Component;
import ru.popov.bodya.daggerplussmallclean.di.api.ApiModule;
import ru.popov.bodya.daggerplussmallclean.di.login.LoginActivityComponent;
import ru.popov.bodya.daggerplussmallclean.di.mail.MailComponent;
import ru.popov.bodya.daggerplussmallclean.di.mail.MailModule;

/**
 * @author Bogdan Popov
 */
@Singleton
@Component(modules = {ApiModule.class})
public interface AppComponent {

    LoginActivityComponent createLoginComponent();

    MailComponent createMailComponent(MailModule mailModule);
}
