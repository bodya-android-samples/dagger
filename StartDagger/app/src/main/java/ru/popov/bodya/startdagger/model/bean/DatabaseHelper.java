package ru.popov.bodya.startdagger.model.bean;

/**
 * @author Bogdan Popov
 */
public class DatabaseHelper {
    private String mDataBaseName;

    public DatabaseHelper(String databaseName) {
        mDataBaseName = databaseName;
    }

    public String getDataBaseName() {
        return mDataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        mDataBaseName = dataBaseName;
    }


}
