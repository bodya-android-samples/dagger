package ru.popov.bodya.basicdagger.di;

/**
 * @author Popov Bogdan
 */

/**
 * именнованные инжекты {@link javax.inject.Named}
 */
public class Names {

    /**
     * использует API бэка
     */
    public static final String BACKEND_API = "api_prod";

    /**
     * использует JSON вместо взаимодействия с бэком
     */
    public static final String STUB_API = "api_stub";

    private Names() {
    }
}