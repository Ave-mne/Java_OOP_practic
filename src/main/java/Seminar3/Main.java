package Seminar3;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("Иван", "Иванов", 25))
                .addUser(new User("Петр", "Петров", 23))
                .addUser(new User("Сергей", "Сергеев", 45))
                .addUser(new User("Вася", "Васильев", 21))
;

        for (User user:personal) {
            System.out.println(user);
        }

        List<User> users = personal.getUsers();
        System.out.println("__________");
        Collections.sort(users);

        for (User user:personal) {
            System.out.println(user);
        }
        User bigBoss = new User("Дмитрий", "Петрович", 40);
        bigBoss.setPersonal(personal);
        User littleBoss = new User("Олег", "Петрович", 35);
        personal.addUser(littleBoss);
        littleBoss.setPersonal(new Personal().addUser(new User("Костя", "Петров", 35)));


        System.out.println("=============");
        Company company = new Company(bigBoss);


        User middleBoss = new User("Михаил", "Петрович", 25);
        personal.addUser(middleBoss);
        middleBoss.setPersonal(new Personal().addUser(new User("Иван", "Попов", 20))
                .addUser(new User("Коля", "Попов", 20)));

        for (User user:company) {
            System.out.println(user);
        }
    }
}