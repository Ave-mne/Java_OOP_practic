package Seminar6_HomeWork_Notes.Model;

public class User {
    private String id = "";
    private String header;
    private String text;


    public User(String header, String text) {
        this.header = header;
        this.text = text;

    }

    public User(String id, String header, String text) {
        this(header, text);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }





    @Override
    public String toString() {
        return String.format("Заметки:\n: %s,Заголовок: %s,Текст: %s", id, header, text);
    }
}
