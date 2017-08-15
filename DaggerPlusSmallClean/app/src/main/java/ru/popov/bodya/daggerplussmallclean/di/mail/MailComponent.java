package ru.popov.bodya.daggerplussmallclean.di.mail;

import dagger.Subcomponent;
import ru.popov.bodya.daggerplussmallclean.di.folders.FolderListActivityComponent;
import ru.popov.bodya.daggerplussmallclean.di.letters.LetterListActivityComponent;
import ru.popov.bodya.daggerplussmallclean.di.letters.LetterListActivityModule;

/**
 * @author Bogdan Popov
 */
@MailScope
@Subcomponent(modules = MailModule.class)
public interface MailComponent {

    FolderListActivityComponent createFoldersListActivityComponent();

    LetterListActivityComponent createLetterListActivityComponent(LetterListActivityModule letterListActivityModule);

}
