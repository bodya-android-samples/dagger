package ru.popov.bodya.daggerplussmallclean.di.letters;

import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.daggerplussmallclean.domain.mail.MailManager;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.model.Folder;
import ru.popov.bodya.daggerplussmallclean.presentation.letters.presenter.ILettersPresenter;
import ru.popov.bodya.daggerplussmallclean.presentation.letters.presenter.LetterListActivityPresenter;

/**
 * @author Bogdan Popov
 */
@Module
public class LetterListActivityModule {

    private Folder folder;

    public LetterListActivityModule(Folder folder) {
        this.folder = folder;
    }

    @LettersScope
    @Provides
    public Folder provideFolder() {
        return folder;
    }

    @LettersScope
    @Provides
    public ILettersPresenter provideLettersListActivityPresenter(Folder folder, MailManager mailManager) {
        return new LetterListActivityPresenter(folder, mailManager);
    }
}
