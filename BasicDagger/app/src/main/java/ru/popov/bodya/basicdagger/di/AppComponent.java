package ru.popov.bodya.basicdagger.di;

import dagger.Component;
import ru.popov.bodya.basicdagger.di.module.NetworkModule;
import ru.popov.bodya.basicdagger.di.module.StorageModule;

/**
 * @author Popov Bogdan.
 */

@Component(modules = {NetworkModule.class, StorageModule.class})
public interface AppComponent {

    OldSubComponent createOldMySubComponent();

    ModernSubComponent.ModernBuilder modernSubComponentBuilder();

}
