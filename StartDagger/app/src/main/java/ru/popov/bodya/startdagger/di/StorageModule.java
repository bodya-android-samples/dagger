package ru.popov.bodya.startdagger.di;

import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.startdagger.bean.DatabaseHelper;

/**
 * @author Bogdan Popov
 */

@Module
public class StorageModule {

    @Provides
    DatabaseHelper provideDatabaseHelper() {
        return new DatabaseHelper();
    }

}
