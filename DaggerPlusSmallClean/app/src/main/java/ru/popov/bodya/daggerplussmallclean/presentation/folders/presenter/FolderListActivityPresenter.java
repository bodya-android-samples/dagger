package ru.popov.bodya.daggerplussmallclean.presentation.folders.presenter;

import android.util.Log;

import ru.popov.bodya.daggerplussmallclean.business.mail.MailManager;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.model.Folder;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.view.IFoldersView;

/**
 * @author Bogdan Popov
 */
public class FolderListActivityPresenter implements IFoldersPresenter {

    private static final String TAG = FolderListActivityPresenter.class.getSimpleName();

    private IFoldersView mFoldersView;
    private MailManager mailManager;

    public FolderListActivityPresenter(MailManager mailManager) {
        this.mailManager = mailManager;
    }

    @Override
    public void loadFolders() {
        mFoldersView.showFolders(mailManager.getFolders());
    }

    @Override
    public void openFolder(Folder folder) {
        Log.e(TAG, "folder open: " + folder);
        mFoldersView.openFolder(folder);
    }

    @Override
    public void attachView(IFoldersView foldersView) {
        mFoldersView = foldersView;
    }

    @Override
    public void detachView() {
        mFoldersView = null;
    }


}

