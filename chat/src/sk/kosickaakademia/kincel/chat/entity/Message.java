package sk.kosickaakademia.kincel.chat.entity;

import java.util.Date;

public class Message {

    private int id;

    public Message(String user, String textMessage, Date date) {

        this.user = user;

        this.date = date;

        this.textMessage = textMessage;
    }

    private String user;

    private String contact;

    private Date date;

    private String textMessage;

    public Message(int id, String user, String contact, Date date, String textMessage) {
        this.id = id;

        this.user = user;

        this.contact = contact;

        this.date = date;

        this.textMessage = textMessage;
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getContact() {
        return contact;
    }

    public Date getDate() {
        return date;
    }

    public String getTextMessage() {
        return textMessage;
    }
}