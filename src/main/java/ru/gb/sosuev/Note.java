package ru.gb.sosuev;

public class Note {
    private String text;
    private String dateTime;

    public Note(String text, String dateTime) {
        this.text = text;
        this.dateTime = dateTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}