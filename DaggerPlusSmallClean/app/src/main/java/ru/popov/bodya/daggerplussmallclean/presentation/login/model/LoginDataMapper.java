package ru.popov.bodya.daggerplussmallclean.presentation.login.model;

import java.util.Calendar;
import java.util.Date;

import ru.popov.bodya.daggerplussmallclean.data.Account;
import ru.popov.bodya.daggerplussmallclean.data.mapper.Mapper;

/**
 * @author Bogdan Popov
 */
public class LoginDataMapper extends Mapper<LoginData, Account> {

    @Override
    public Account map(LoginData value) {
        String login = value.getLogin();
        String password = value.getPassword();
        Date date = Calendar.getInstance().getTime();
        return new Account(login, password, date);
    }

    @Override
    public LoginData reverseMap(Account value) {
        String login = value.getLogin();
        String password = value.getPassword();
        return new LoginData(login, password);
    }
}
