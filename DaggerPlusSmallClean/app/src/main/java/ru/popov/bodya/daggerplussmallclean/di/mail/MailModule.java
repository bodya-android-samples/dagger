package ru.popov.bodya.daggerplussmallclean.di.mail;


import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.daggerplussmallclean.business.api.ApiService;
import ru.popov.bodya.daggerplussmallclean.business.mail.MailManager;
import ru.popov.bodya.daggerplussmallclean.data.Account;

@Module
public class MailModule {

    private Account account;

    public MailModule(Account account) {
        this.account = account;
    }

    @Provides
    public Account provideAccount() {
        return account;
    }

    @Provides
    @MailScope
    MailManager provideMailManager(Account account, ApiService apiService) {
        return new MailManager(account, apiService);
    }

}
