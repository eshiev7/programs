package ru.nsu.home;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ImplAccountManager implements AccountManager {

    private DataBase base = DataBase.getInstance("mail.csv");

    @Override
    public void registerNewAccount(String email, String password, Person person) throws IOException, DuplicateAccountException {
        File file = new File(base.dataBase.getName());
        file.createNewFile();
        List<String> lines = Files.readAllLines(Paths.get("mail.csv"), StandardCharsets.UTF_8);
        if(hasAccount(email) == true){
            throw new DuplicateAccountException("Такой аккаунт уже есть");
        }
        else {
            BufferedWriter writer = new BufferedWriter(new FileWriter(base.dataBase.getName(), true));
            String kek = email + " " + password + " " + person.getInfo();
            kek.split(" ");
            writer.write(kek);
            writer.newLine();
            writer.flush();
            writer.close();
        }
    }


    @Override
    public void removeAccount(String email, String password) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("mail.csv"), StandardCharsets.UTF_8);
        for(String h: lines){
            if(email.equals(Arrays.asList(h.split(" ")).get(0)) && password.equals(Arrays.asList(h.split(" ")).get(1))) {
                lines.remove(h);
                break;
            }
        }
        System.out.println(lines);
        BufferedWriter rewriter = new BufferedWriter(new FileWriter(base.dataBase.getName()));
        for(String h: lines) {
            String kek1 = Arrays.asList(h.split(" ")).get(0) +
                    " " + Arrays.asList(h.split(" ")).get(1) +
                    " " + Arrays.asList(h.split(" ")).get(2) +
                    " " + Arrays.asList(h.split(" ")).get(3) +
                    " " + Arrays.asList(h.split(" ")).get(4) +
                    " " + Arrays.asList(h.split(" ")).get(5);
            rewriter.write(kek1);
            rewriter.newLine();

        }
        rewriter.flush();
        rewriter.close();
    }

    @Override
    public boolean hasAccount(String email) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("mail.csv"), StandardCharsets.UTF_8);
        for(String h: lines){
            if(email.equals(Arrays.asList(h.split(" ")).get(0))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Person getPerson(String email, String password) throws TooManyLoginAttemptsException, IOException {
        List<String> lines = Files.readAllLines(Paths.get("mail.csv"), StandardCharsets.UTF_8);
        if(base.getCount() < 5) {
            for (String h : lines) {
                if (email.equals(Arrays.asList(h.split(" ")).get(0)) && password.equals(Arrays.asList(h.split(" ")).get(1))) {
                    base.setCount(0);
                    return new Person((Arrays.asList(h.split(" ")).get(2)),
                                (Arrays.asList(h.split(" ")).get(3)),
                                (Arrays.asList(h.split(" ")).get(4)),
                                (Arrays.asList(h.split(" ")).get(5)));
                }
            }
            base.upCount();
            if(base.getCount() == 5){
                throw new TooManyLoginAttemptsException("Слишком много попыток авторизоваться!");
            }
        }
        return null;
    }

    @Override
    public int numOfAccounts() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("mail.csv"), StandardCharsets.UTF_8);
        return lines.size();
    }
}
