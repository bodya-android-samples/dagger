package ru.popov.bodya.startdagger.di.component;

import dagger.Component;
import ru.popov.bodya.startdagger.activity.FirstLessonActivity;
import ru.popov.bodya.startdagger.activity.SecondLessonActivity;
import ru.popov.bodya.startdagger.di.module.NetworkModule;
import ru.popov.bodya.startdagger.di.module.StorageModule;

/**
 * @author Bogdan Popov
 */

@Component(modules = {StorageModule.class, NetworkModule.class})
public interface InjectAppComponent {
    void injectsFirstLessonActivity(FirstLessonActivity firstLessonActivity);

    void injectsSecondLessonActivity(SecondLessonActivity secondLessonActivity);
}
