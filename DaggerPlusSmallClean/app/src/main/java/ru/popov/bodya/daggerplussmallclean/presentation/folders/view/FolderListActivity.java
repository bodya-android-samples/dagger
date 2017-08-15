package ru.popov.bodya.daggerplussmallclean.presentation.folders.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import javax.inject.Inject;

import ru.popov.bodya.daggerplussmallclean.App;
import ru.popov.bodya.daggerplussmallclean.R;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.model.Folder;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.presenter.IFoldersPresenter;
import ru.popov.bodya.daggerplussmallclean.presentation.letters.view.LetterListActivity;

public class FolderListActivity extends AppCompatActivity implements IFoldersView {

    private static final String TAG = FolderListActivity.class.getSimpleName();
    private static final String FOLDER_EXTRA_KEY = "folder";

    @Inject
    public IFoldersPresenter mPresenter;

    private ArrayAdapter<Folder> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folders_list);

        Log.e(TAG, "mail component status: " + App.getInstance().getMailComponent());

        App.getInstance().getMailComponent().createFoldersListActivityComponent().injectFoldersListActivity(this);

        ListView foldersListView = (ListView) findViewById(R.id.foldersList);

        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);

        foldersListView.setAdapter(mAdapter);
        foldersListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mPresenter.openFolder(mAdapter.getItem(i));
            }
        });

        mPresenter.loadFolders();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }

    @Override
    public void showFolders(List<Folder> folders) {
        mAdapter.clear();
        mAdapter.addAll(folders);
    }

    @Override
    public void openFolder(Folder folder) {
        Intent intent = new Intent(this, LetterListActivity.class);
        intent.putExtra(FOLDER_EXTRA_KEY, folder);
        startActivity(intent);
    }

    @Inject
    void setActivity() {
        mPresenter.attachView(this);
    }


}
