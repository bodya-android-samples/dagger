package ru.popov.bodya.daggerplussmallclean.presentation.letters.model;

public class Letter {

    private String subject;

    public Letter(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return subject;
    }
}
