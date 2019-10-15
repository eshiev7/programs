package ru.nsu.home;

import java.io.IOException;

public interface AccountManager {
    void registerNewAccount(String email, String password, Person person) throws DuplicateAccountException, IOException;
    void removeAccount(String email, String password) throws IOException;
    boolean hasAccount(String email) throws IOException;
    Person getPerson(String email, String password) throws TooManyLoginAttemptsException, IOException;
    int numOfAccounts() throws IOException;
}
