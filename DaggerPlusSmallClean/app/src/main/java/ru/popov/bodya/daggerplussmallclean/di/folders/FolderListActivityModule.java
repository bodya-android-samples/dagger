package ru.popov.bodya.daggerplussmallclean.di.folders;


import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.daggerplussmallclean.business.mail.MailManager;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.presenter.FolderListActivityPresenter;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.presenter.IFoldersPresenter;

/**
 * @author Bogdan Popov
 */
@Module
public class FolderListActivityModule {

    @FoldersScope
    @Provides
    IFoldersPresenter provideFoldersListActivityPresenter(MailManager mailManager) {
        return new FolderListActivityPresenter(mailManager);
    }
}
