package ru.popov.bodya.startdagger.di.component;

import dagger.Component;
import dagger.Subcomponent;
import ru.popov.bodya.startdagger.di.module.StorageModule;
import ru.popov.bodya.startdagger.di.qualifier.ReleaseDatabaseHelper;
import ru.popov.bodya.startdagger.di.qualifier.TestDatabaseHelper;
import ru.popov.bodya.startdagger.model.bean.DatabaseHelper;

/**
 * @author Bogdan Popov
 */
@Subcomponent(modules = {StorageModule.class})
public interface ChildComponent {

    @TestDatabaseHelper
    DatabaseHelper getTestDatabaseHelper();

    @ReleaseDatabaseHelper
    DatabaseHelper getReleaseDatabaseHelper();

}
