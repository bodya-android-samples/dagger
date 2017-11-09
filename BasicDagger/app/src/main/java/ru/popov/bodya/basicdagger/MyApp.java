package ru.popov.bodya.basicdagger;

import android.app.Application;

import ru.popov.bodya.basicdagger.di.AppComponent;
import ru.popov.bodya.basicdagger.di.DaggerAppComponent;
import ru.popov.bodya.basicdagger.di.IHasComponent;

/**
 * @author Popov Bogdan.
 */

public class MyApp extends Application implements IHasComponent<AppComponent> {

    private AppComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mComponent = DaggerAppComponent.builder().build();
    }

    @Override
    public AppComponent getComponent() {
        return mComponent;
    }
}
