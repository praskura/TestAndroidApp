package ru.startandroid.testapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Map;

/*public class PasswordsDB {
    Map<String, String> logPass;

    public void add(String login, String password) {
        logPass.put(login, password);
    }

    public void delete(String login) {
        logPass.remove(login);
    }

    public boolean check(String login, String password) {
        return (logPass.get(login).equals(password));
    }
}*/


public class MainActivity extends Activity implements View.OnClickListener {

    PasswordsDB pDB = new PasswordsDB();
    //заполнить

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public boolean checkPassword(String login, String password) {
        return true;//(login.);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.btn_logIn:

        }
    }
}