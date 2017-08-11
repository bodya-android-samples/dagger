package ru.popov.bodya.startdagger.di.module;

import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.startdagger.model.bean.DatabaseHelper;
import ru.popov.bodya.startdagger.di.qualifier.ReleaseDatabaseHelper;
import ru.popov.bodya.startdagger.di.qualifier.TestDatabaseHelper;

/**
 * @author Bogdan Popov
 */

@Module
public class StorageModule {


    @ReleaseDatabaseHelper
    @Provides
    DatabaseHelper provideReleaseDatabaseHelper() {
        return new DatabaseHelper("release.db");
    }


    @TestDatabaseHelper
    @Provides
    DatabaseHelper provideTestDatabaseHelper() {
        return new DatabaseHelper("test.db");
    }

}
