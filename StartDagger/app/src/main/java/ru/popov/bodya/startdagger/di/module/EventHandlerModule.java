package ru.popov.bodya.startdagger.di.module;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import ru.popov.bodya.startdagger.model.EventHandler;
import ru.popov.bodya.startdagger.model.bean.AnalyticsManager;
import ru.popov.bodya.startdagger.model.bean.Logger;

/**
 * @author Bogdan Popov
 */


@Module
public class EventHandlerModule {

    @Provides
    @IntoSet
    EventHandler provideAnalyticsManager() {
        return new AnalyticsManager();
    }

    @Provides
    @IntoSet
    EventHandler provideLogger() {
        return new Logger();
    }


}
