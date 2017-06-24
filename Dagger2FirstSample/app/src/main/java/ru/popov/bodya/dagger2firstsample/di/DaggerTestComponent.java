package ru.popov.bodya.dagger2firstsample.di;

import javax.inject.Singleton;

import dagger.Component;
import ru.popov.bodya.dagger2firstsample.MainActivity;
import ru.popov.bodya.dagger2firstsample.model.Speaker;

@Component(modules = {DaggerTestImageModelModule.class, DaggerTestSpeakerModule.class})
@Singleton
public interface DaggerTestComponent {
    void inject(MainActivity mainActivity);

    Speaker speaker();
}
