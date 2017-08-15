package ru.popov.bodya.daggerplussmallclean.presentation.letters.presenter;


import ru.popov.bodya.daggerplussmallclean.business.mail.MailManager;
import ru.popov.bodya.daggerplussmallclean.presentation.folders.model.Folder;
import ru.popov.bodya.daggerplussmallclean.presentation.letters.view.ILettersView;

/**
 * @author Bogdan Popov
 */
public class LetterListActivityPresenter implements ILettersPresenter {

    private ILettersView mView;
    private Folder mFolder;
    private MailManager mailManager;

    public LetterListActivityPresenter(Folder folder, MailManager mailManager) {
        this.mFolder = folder;
        this.mailManager = mailManager;
    }

    @Override
    public void attachView(ILettersView view) {
        this.mView = view;
    }

    @Override
    public void loadLetters() {
        mView.showLetters(mailManager.getLetters(mFolder));
    }

    @Override
    public void detachView() {
        mView = null;
    }
}
