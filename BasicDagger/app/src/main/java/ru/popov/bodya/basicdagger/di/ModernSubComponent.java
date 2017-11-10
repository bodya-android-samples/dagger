package ru.popov.bodya.basicdagger.di;

import dagger.Subcomponent;
import ru.popov.bodya.basicdagger.MainActivity;

/**
 * @author Popov Bogdan
 */

@Subcomponent
public interface ModernSubComponent {

    @Subcomponent.Builder
    interface ModernBuilder {
        ModernSubComponent build();
    }

    void inject(MainActivity mainActivity);

}
