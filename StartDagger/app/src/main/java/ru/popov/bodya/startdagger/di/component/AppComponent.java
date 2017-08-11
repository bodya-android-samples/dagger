package ru.popov.bodya.startdagger.di.component;

import dagger.Component;
import ru.popov.bodya.startdagger.bean.DatabaseHelper;
import ru.popov.bodya.startdagger.bean.NetworkUtils;
import ru.popov.bodya.startdagger.di.module.NetworkModule;
import ru.popov.bodya.startdagger.di.module.StorageModule;
import ru.popov.bodya.startdagger.di.qualifier.ReleaseDatabaseHelper;
import ru.popov.bodya.startdagger.di.qualifier.TestDatabaseHelper;

/**
 * @author Bogdan Popov
 */


@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {
    NetworkUtils getNetworkUtils();

    @TestDatabaseHelper
    DatabaseHelper getTestDatabaseHelper();

    @ReleaseDatabaseHelper
    DatabaseHelper getReleaseDatabaseHelper();
}
