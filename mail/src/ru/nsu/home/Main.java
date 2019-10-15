package ru.nsu.home;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, DuplicateAccountException, TooManyLoginAttemptsException {
        AccountManager facebook = new ImplAccountManager();
        Person p1 = new Person("Eshiev", "Anton", "Timurovich", "29.09.98");
        Person p2 = new Person("Eshiev1", "Anton1", "Timurovich1", "291.09.98");
        facebook.registerNewAccount("mr.ae7@mail.ru", "anton", p1);
        facebook.registerNewAccount("mr.ae7@mail4.ru", "anton", p1);
        facebook.registerNewAccount("mr.ae7@mail5.ru", "anton", p1);
        facebook.registerNewAccount("mr.ae7@mail6.ru", "anton", p1);
        facebook.registerNewAccount("mr.ae7@mail7.ru", "anton", p1);
//        facebook.removeAccount("mr.ae7@mail.ru", "anton");
//        facebook.removeAccount("mr.ae7@mail4.ru", "anton");
//
//        facebook.removeAccount("mr.ae7@mail7.ru", "anton");

    }
}
