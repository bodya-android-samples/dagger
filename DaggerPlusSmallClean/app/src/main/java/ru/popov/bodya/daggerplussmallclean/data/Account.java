package ru.popov.bodya.daggerplussmallclean.data;

import java.util.Date;

public class Account {

    private String login;
    private String password;
    private Date registrationDate;
    private int id;

    public Account() {
    }

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Account(String login, String password, Date registrationDate) {
        this(login, password);
        this.registrationDate = registrationDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Account account = (Account) o;

        if (id != account.id) {
            return false;
        }
        if (login != null ? !login.equals(account.login) : account.login != null) {
            return false;
        }
        if (password != null ? !password.equals(account.password) : account.password != null) {
            return false;
        }
        return registrationDate != null ? registrationDate.equals(account.registrationDate) : account.registrationDate == null;

    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (registrationDate != null ? registrationDate.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
