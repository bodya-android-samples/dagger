package ru.popov.bodya.daggerplussmallclean.business.api;

import java.util.ArrayList;
import java.util.List;

import ru.popov.bodya.daggerplussmallclean.data.Account;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.model.Folder;
import ru.popov.bodya.daggerplussmallclean.presentation.letters.model.Letter;

/**
 * @author Bogdan Popov
 */
public class ApiService {

    public List<Folder> getFolders(Account account) {
        return generateFakeFolders();
    }

    public List<Letter> getLetters(Folder folder) {
        return generateFakeLetters();
    }

    private List<Folder> generateFakeFolders() {
        List<Folder> folders = new ArrayList<>();
        folders.add(new Folder("Inbox"));
        folders.add(new Folder("Sent"));
        folders.add(new Folder("Starred"));
        folders.add(new Folder("Drafts"));
        return folders;
    }

    private List<Letter> generateFakeLetters() {
        List<Letter> letters = new ArrayList<>();
        letters.add(new Letter("Subject 1"));
        letters.add(new Letter("Subject 2"));
        letters.add(new Letter("Subject 3"));
        letters.add(new Letter("Subject 4"));
        return letters;
    }

}
