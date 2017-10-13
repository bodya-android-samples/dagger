package ru.popov.bodya.basicdagger;

import android.app.Application;

/**
 * @author Popov Bogdan.
 */

public class MyApp extends Application implements IHasComponent<AppComponent> {

    private AppComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mComponent = DaggerAppComponent.create();
    }

    @Override
    public AppComponent getComponent() {
        return mComponent;
    }
}
