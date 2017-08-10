package ru.popov.bodya.startdagger;

import ru.popov.bodya.startdagger.di.AppComponent;
import ru.popov.bodya.startdagger.di.DaggerAppComponent;

/**
 * @author Bogdan Popov
 */


public class Application extends android.app.Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
