package ru.popov.bodya.daggerplussmallclean.di.folders;


import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.daggerplussmallclean.business.mail.MailManager;
import ru.popov.bodya.daggerplussmallclean.di.common.ActivityScope;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.presenter.FolderListActivityPresenter;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.presenter.IFoldersPresenter;

@Module
public class FolderListActivityModule {

    @ActivityScope
    @Provides
    public IFoldersPresenter provideFoldersListActivityPresenter(MailManager mailManager) {
        return new FolderListActivityPresenter(mailManager);
    }
}
