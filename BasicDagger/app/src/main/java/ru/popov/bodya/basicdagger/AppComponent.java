package ru.popov.bodya.basicdagger;

import dagger.Component;
import ru.popov.bodya.basicdagger.di.module.NetworkModule;
import ru.popov.bodya.basicdagger.di.module.StorageModule;

/**
 * @author Popov Bogdan.
 */

@Component(modules = {NetworkModule.class, StorageModule.class})
public interface AppComponent {

    void injectsMainActivity(MainActivity mainActivity);

}
