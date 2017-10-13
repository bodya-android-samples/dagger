package ru.popov.bodya.basicdagger.di.module;

import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.basicdagger.storage.DefaultUserRepository;
import ru.popov.bodya.basicdagger.storage.IUserRepository;

/**
 * @author Popov Bogdan.
 */

@Module
public class StorageModule {

    @Provides
    IUserRepository provideDatabaseHelper() {
        return new DefaultUserRepository();
    }
}
