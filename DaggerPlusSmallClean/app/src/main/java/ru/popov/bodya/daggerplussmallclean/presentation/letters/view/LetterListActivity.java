package ru.popov.bodya.daggerplussmallclean.presentation.letters.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import javax.inject.Inject;

import ru.popov.bodya.daggerplussmallclean.data.application.App;
import ru.popov.bodya.daggerplussmallclean.R;
import ru.popov.bodya.daggerplussmallclean.di.letters.LetterListActivityModule;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.model.Folder;
import ru.popov.bodya.daggerplussmallclean.presentation.letters.model.Letter;
import ru.popov.bodya.daggerplussmallclean.presentation.letters.presenter.ILettersPresenter;

/**
 * @author Bogdan Popov
 */
public class LetterListActivity extends AppCompatActivity implements ILettersView {

    @Inject
    public ILettersPresenter mPresenter;

    private ArrayAdapter<Letter> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letters_list);
        Folder folder = (Folder) getIntent().getSerializableExtra("folder");
        App.getInstance().getMailComponent().createLetterListActivityComponent(new LetterListActivityModule(folder)).injectLettersListActivity(this);

        ListView lettersListView = (ListView) findViewById(R.id.lettersList);

        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);

        lettersListView.setAdapter(mAdapter);

        mPresenter.loadLetters();

    }

    @Override
    public void showLetters(List<Letter> letters) {
        mAdapter.clear();
        mAdapter.addAll(letters);
    }

    @Inject
    void setActivity() {
        mPresenter.attachView(this);
    }
}
