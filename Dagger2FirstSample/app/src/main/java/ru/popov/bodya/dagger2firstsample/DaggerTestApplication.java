package ru.popov.bodya.dagger2firstsample;


import android.app.Application;
import android.content.Context;

import ru.popov.bodya.dagger2firstsample.di.DaggerDaggerTestComponent;
import ru.popov.bodya.dagger2firstsample.di.DaggerTestComponent;
import ru.popov.bodya.dagger2firstsample.di.DaggerTestImageModelModule;
import ru.popov.bodya.dagger2firstsample.di.DaggerTestSpeakerModule;

public class DaggerTestApplication extends Application {
    DaggerTestComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerDaggerTestComponent
                .builder()
                .daggerTestImageModelModule(new DaggerTestImageModelModule())
                .daggerTestSpeakerModule(new DaggerTestSpeakerModule())
                .build();
    }

    public static DaggerTestComponent component(Context context) {
        return ((DaggerTestApplication) context.getApplicationContext()).component;
    }
}
