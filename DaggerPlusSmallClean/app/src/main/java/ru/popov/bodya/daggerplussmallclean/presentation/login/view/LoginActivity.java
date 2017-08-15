package ru.popov.bodya.daggerplussmallclean.presentation.login.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.inject.Inject;

import ru.popov.bodya.daggerplussmallclean.data.application.App;
import ru.popov.bodya.daggerplussmallclean.R;
import ru.popov.bodya.daggerplussmallclean.data.Account;
import ru.popov.bodya.daggerplussmallclean.di.login.LoginActivityComponent;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.view.FolderListActivity;
import ru.popov.bodya.daggerplussmallclean.presentation.login.model.LoginData;
import ru.popov.bodya.daggerplussmallclean.presentation.login.presenter.ILoginPresenter;

/**
 * @author Bogdan Popov
 */
public class LoginActivity extends AppCompatActivity implements ILoginView {

    private static final String TAG = LoginActivity.class.getSimpleName();

    @Inject
    ILoginPresenter mPresenter;

    private EditText mUserLoginEditText;
    private EditText mPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginActivityComponent loginActivityComponent = App.getInstance().getAppComponent().createLoginComponent();

        Log.e(TAG, "loginActivity = " + loginActivityComponent);

        loginActivityComponent.injectLoginActivity(this);

        mUserLoginEditText = (EditText) findViewById(R.id.user);
        mPasswordEditText = (EditText) findViewById(R.id.password);

        Button button = (Button) findViewById(R.id.loginButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.loginUser(createLoginData());
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        App instance = App.getInstance();
        if (instance.getMailComponent() != null) {
            instance.releaseMailComponent();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "detaching view");
        mPresenter.detachView();
    }

    @Override
    public void showMailForAccount(Account account) {
        App.getInstance().createMailComponent(account);
        startActivity(new Intent(this, FolderListActivity.class));
    }

    @Inject
    void setActivity() {
        mPresenter.attachView(this);
    }

    private LoginData createLoginData() {
        String login = mUserLoginEditText.getText().toString();
        String password = mPasswordEditText.getText().toString();
        return new LoginData(login, password);
    }
}
