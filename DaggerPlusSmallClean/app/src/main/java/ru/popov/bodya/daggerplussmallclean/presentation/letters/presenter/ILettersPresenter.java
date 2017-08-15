package ru.popov.bodya.daggerplussmallclean.presentation.letters.presenter;

import ru.popov.bodya.daggerplussmallclean.presentation.common.IBasicPresenter;
import ru.popov.bodya.daggerplussmallclean.presentation.letters.view.ILettersView;

/**
 * @author Bogdan Popov
 */
public interface ILettersPresenter extends IBasicPresenter {

    void attachView(ILettersView lettersView);

    void loadLetters();

}
