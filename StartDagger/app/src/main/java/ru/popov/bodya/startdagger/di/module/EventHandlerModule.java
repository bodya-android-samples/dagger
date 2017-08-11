package ru.popov.bodya.startdagger.di.module;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoSet;
import ru.popov.bodya.startdagger.model.EventHandler;
import ru.popov.bodya.startdagger.model.bean.AnalyticsManager;
import ru.popov.bodya.startdagger.model.bean.Logger;

/**
 * @author Bogdan Popov
 */


@Module
public class EventHandlerModule {

    private static final String INTO_SET = "into_set";
    private static final String ELEMENTS_INTO_SET = "elements_into_set";

    @Provides
    @IntoSet
    @Named(INTO_SET)
    EventHandler provideAnalyticsManager() {
        return new AnalyticsManager();
    }

    @Provides
    @IntoSet
    @Named(INTO_SET)
    EventHandler provideLogger() {
        return new Logger();
    }


    @Provides
    @ElementsIntoSet
    @Named(ELEMENTS_INTO_SET)
    Set<EventHandler> provideEventHandlerSet() {
        return new HashSet<>(Arrays.asList(new AnalyticsManager(), new Logger(), new Logger()));
    }


}
