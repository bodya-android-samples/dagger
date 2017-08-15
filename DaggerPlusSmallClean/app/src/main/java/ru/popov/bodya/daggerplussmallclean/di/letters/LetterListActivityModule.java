package ru.popov.bodya.daggerplussmallclean.di.letters;

import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.daggerplussmallclean.business.mail.MailManager;
import ru.popov.bodya.daggerplussmallclean.di.common.ActivityScope;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.model.Folder;
import ru.popov.bodya.daggerplussmallclean.presentation.letters.presenter.ILettersPresenter;
import ru.popov.bodya.daggerplussmallclean.presentation.letters.presenter.LetterListActivityPresenter;

@Module
public class LetterListActivityModule {

    private Folder folder;

    public LetterListActivityModule(Folder folder) {
        this.folder = folder;
    }

    @ActivityScope
    @Provides
    public Folder provideFolder() {
        return folder;
    }

    @ActivityScope
    @Provides
    public ILettersPresenter provideLettersListActivityPresenter(Folder folder, MailManager mailManager) {
        return new LetterListActivityPresenter(folder, mailManager);
    }
}
