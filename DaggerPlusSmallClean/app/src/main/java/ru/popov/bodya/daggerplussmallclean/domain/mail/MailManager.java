package ru.popov.bodya.daggerplussmallclean.domain.mail;

import java.util.List;

import ru.popov.bodya.daggerplussmallclean.domain.api.ApiService;
import ru.popov.bodya.daggerplussmallclean.data.Account;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.model.Folder;
import ru.popov.bodya.daggerplussmallclean.presentation.letters.model.Letter;

/**
 * @author Bogdan Popov
 */
public class MailManager {

    private Account account;
    private ApiService apiService;

    public MailManager(Account account, ApiService apiService) {
        this.account = account;
        this.apiService = apiService;
    }

    public List<Folder> getFolders() {
        return apiService.getFolders(account);
    }

    public List<Letter> getLetters(Folder folder) {
        return apiService.getLetters(folder);
    }
}
