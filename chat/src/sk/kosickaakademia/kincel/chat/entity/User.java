package sk.kosickaakademia.kincel.chat.entity;

public class User {

    public User(int id, String login, String password) {

        this.password = password;

        this.login = login;

        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public int getId() {
        return id;
    }

    private  String password;

    private String login;

    private int id;


}
