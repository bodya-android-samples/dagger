package ru.popov.bodya.daggerplussmallclean.presentation.folders.presenter;

import ru.popov.bodya.daggerplussmallclean.presentation.common.IBasicPresenter;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.model.Folder;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.view.IFoldersView;

/**
 * @author Bogdan Popov
 */
public interface IFoldersPresenter extends IBasicPresenter {

    void loadFolders();

    void openFolder(Folder folder);

    void attachView(IFoldersView foldersView);

}
