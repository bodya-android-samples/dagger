package ru.popov.bodya.daggerplussmallclean.presentation.folders.view;

import java.util.List;

import ru.popov.bodya.daggerplussmallclean.presentation.common.IBasicView;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.model.Folder;

/**
 * @author Bogdan Popov
 */
public interface IFoldersView extends IBasicView {

    void showFolders(List<Folder> folderList);

    void openFolder(Folder folder);
}
