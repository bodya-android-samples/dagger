package ru.popov.bodya.startdagger.di;

import dagger.Component;
import ru.popov.bodya.startdagger.bean.DatabaseHelper;
import ru.popov.bodya.startdagger.bean.NetworkUtils;

/**
 * @author Bogdan Popov
 */


@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {
    NetworkUtils getNetworkUtils();

    DatabaseHelper getDatabaseHelper();
}
