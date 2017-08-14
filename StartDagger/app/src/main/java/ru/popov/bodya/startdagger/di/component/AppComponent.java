package ru.popov.bodya.startdagger.di.component;

import javax.inject.Singleton;

import dagger.Component;
import ru.popov.bodya.startdagger.model.bean.DatabaseHelper;
import ru.popov.bodya.startdagger.model.bean.NetworkUtils;
import ru.popov.bodya.startdagger.di.module.NetworkModule;
import ru.popov.bodya.startdagger.di.module.StorageModule;
import ru.popov.bodya.startdagger.di.qualifier.ReleaseDatabaseHelper;
import ru.popov.bodya.startdagger.di.qualifier.TestDatabaseHelper;

/**
 * @author Bogdan Popov
 */
@Singleton
@Component(modules = {NetworkModule.class})
public interface AppComponent {

    ChildComponent createChildComponent();

    NetworkUtils getNetworkUtils();
}
