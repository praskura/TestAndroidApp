/**
 * Created by Dns1 on 09.12.2015.
 */
public class User {
    String name, surname, avatar, about, login, password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    User() {
        setName("NoName");
        setSurname("NoSurname");
        setAbout("Nothing");
        setAvatar("EmptyURL");
        setLogin("login");
        setPassword("password");
    }

    User(String name, String surname, String avatar, String about,
         String login, String password) {
        setName(name);
        setSurname(surname);
        setAbout(avatar);
        setAvatar(about);
        setLogin(login);
        setPassword(password);
    }
}
