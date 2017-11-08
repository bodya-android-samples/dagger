package ru.popov.bodya.basicdagger.di;

import dagger.Subcomponent;
import ru.popov.bodya.basicdagger.MainActivity;

/**
 * @author Popov Bogdan
 */

@Subcomponent
public interface SubComponent {

    void injectsMainActivity(MainActivity mainActivity);

}
