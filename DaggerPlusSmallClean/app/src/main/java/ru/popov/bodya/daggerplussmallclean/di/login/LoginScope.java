package ru.popov.bodya.daggerplussmallclean.di.login;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Bogdan Popov
 */
@Scope
@Retention(RUNTIME)
public @interface LoginScope {
}

