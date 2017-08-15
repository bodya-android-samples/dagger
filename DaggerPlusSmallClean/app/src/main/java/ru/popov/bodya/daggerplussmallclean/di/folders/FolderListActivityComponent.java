package ru.popov.bodya.daggerplussmallclean.di.folders;

import dagger.Subcomponent;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.view.FolderListActivity;

/**
 * @author Bogdan Popov
 */
@FoldersScope
@Subcomponent(modules = FolderListActivityModule.class)
public interface FolderListActivityComponent {

    void injectFoldersListActivity(FolderListActivity activity);

}
