package ru.popov.bodya.daggerplussmallclean.di.letters;

import dagger.Subcomponent;
import ru.popov.bodya.daggerplussmallclean.presentation.letters.view.LetterListActivity;

/**
 * @author Bogdan Popov
 */
@LettersScope
@Subcomponent(modules = LetterListActivityModule.class)
public interface LetterListActivityComponent {

    void injectLettersListActivity(LetterListActivity activity);

}
