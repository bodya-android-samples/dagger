package ru.popov.bodya.basicdagger;

import dagger.Component;
import ru.popov.bodya.basicdagger.di.NetworkModule;
import ru.popov.bodya.basicdagger.di.StorageModule;
import ru.popov.bodya.basicdagger.net.DefaultNetworkApi;
import ru.popov.bodya.basicdagger.net.INetworkApi;
import ru.popov.bodya.basicdagger.storage.IUserRepository;

/**
 * @author Popov Bogdan.
 */

@Component(modules = {NetworkModule.class, StorageModule.class})
public interface AppComponent {

    void injectsMainActivity(MainActivity mainActivity);

}
