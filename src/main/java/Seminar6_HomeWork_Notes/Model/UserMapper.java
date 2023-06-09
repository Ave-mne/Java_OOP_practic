package Seminar6_HomeWork_Notes.Model;

public class UserMapper {
    public String map(User user) {
        return String.format("%s,%s,%s", user.getId(), user.getHeader(), user.getText());
    }

    public User map(String line) {
        String[] lines = line.split(",");
        return new User(lines[0], lines[1], lines[2]);
    }
}