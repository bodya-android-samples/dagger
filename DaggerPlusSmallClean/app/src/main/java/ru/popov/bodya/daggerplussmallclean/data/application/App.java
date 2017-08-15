package ru.popov.bodya.daggerplussmallclean.data.application;

import android.app.Application;

import ru.popov.bodya.daggerplussmallclean.di.app.AppComponent;
import ru.popov.bodya.daggerplussmallclean.data.Account;
import ru.popov.bodya.daggerplussmallclean.di.app.DaggerAppComponent;
import ru.popov.bodya.daggerplussmallclean.di.mail.MailComponent;
import ru.popov.bodya.daggerplussmallclean.di.mail.MailModule;

/**
 * @author Bogdan Popov
 */
public class App extends Application {

    private static App sInstance;

    private AppComponent mAppComponent;
    private MailComponent mMailComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        mAppComponent = DaggerAppComponent.create();
    }

    public static App getInstance() {
        return sInstance;
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    public void createMailComponent(Account account) {
        mMailComponent = mAppComponent.createMailComponent(new MailModule(account));
    }

    public MailComponent getMailComponent() {
        return mMailComponent;
    }

    public void releaseMailComponent() {
        mMailComponent = null;
    }
}
