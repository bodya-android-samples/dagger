package ru.popov.bodya.daggerplussmallclean.presentation.folders.model;

import java.io.Serializable;

/**
 * @author Bogdan Popov
 */
public class Folder implements Serializable {

    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
