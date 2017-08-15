package ru.popov.bodya.daggerplussmallclean.presentation.login.view;

import ru.popov.bodya.daggerplussmallclean.data.Account;
import ru.popov.bodya.daggerplussmallclean.presentation.common.IBasicView;

/**
 * @author Bogdan Popov
 */
public interface ILoginView extends IBasicView {

    void showMailForAccount(Account account);

}
