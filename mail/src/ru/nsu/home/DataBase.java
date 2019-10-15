package ru.nsu.home;

import java.io.*;

public final class DataBase {

    private static DataBase instance;
    public File dataBase;
    private static int count = 0;

    private DataBase(String dataBaseName) {
        dataBase = new File(dataBaseName);
    }

    public static DataBase getInstance(String value) {
        if (instance == null) {
            instance = new DataBase(value);
        }
        return instance;
    }

    public int getCount() {
        return count;
    }

    public void upCount() {
        count++;
    }
    public void setCount(int count1) {
        count = count1;
    }
}
