package ru.popov.bodya.startdagger;

import ru.popov.bodya.startdagger.di.component.AppComponent;
import ru.popov.bodya.startdagger.di.component.DaggerAppComponent;
import ru.popov.bodya.startdagger.di.component.DaggerInjectAppComponent;
import ru.popov.bodya.startdagger.di.component.InjectAppComponent;

/**
 * @author Bogdan Popov
 */


public class Application extends android.app.Application {

    private AppComponent mAppComponent;
    private InjectAppComponent mInjectAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.create();
        mInjectAppComponent = DaggerInjectAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    public InjectAppComponent getInjectAppComponent() {
        return mInjectAppComponent;
    }
}
