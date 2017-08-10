package ru.popov.bodya.startdagger.di;

import dagger.Component;
import ru.popov.bodya.startdagger.MainActivity;

/**
 * @author Bogdan Popov
 */

@Component(modules = {StorageModule.class, NetworkModule.class})
public interface InjectAppComponent {
    void injectsMainActivity(MainActivity mainActivity);
}
