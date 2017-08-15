package ru.popov.bodya.daggerplussmallclean.presentation.letters.view;

import java.util.List;

import ru.popov.bodya.daggerplussmallclean.presentation.common.IBasicView;
import ru.popov.bodya.daggerplussmallclean.presentation.letters.model.Letter;

/**
 * @author Bogdan Popov
 */
public interface ILettersView extends IBasicView {

    void showLetters(List<Letter> letterList);

}
