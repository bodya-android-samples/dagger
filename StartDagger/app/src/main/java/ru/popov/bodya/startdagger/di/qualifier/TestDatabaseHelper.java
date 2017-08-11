package ru.popov.bodya.startdagger.di.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @author Bogdan Popov
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface TestDatabaseHelper {
}
