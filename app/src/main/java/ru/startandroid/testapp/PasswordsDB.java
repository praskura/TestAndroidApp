package ru.startandroid.testapp;

import java.util.Map;

/**
 * Created by Dns1 on 09.12.2015.
 */
public class PasswordsDB {
    private Map<String, String> logPass;

    public void add(String login, String password) {
        logPass.put(login, password);
    }

    public void delete(String login) {
        logPass.remove(login);
    }

    public boolean check(String login, String password) {
        return (logPass.get(login).equals(password));
    }
}
