package Seminar6_HomeWork.View;


import java.util.Scanner;
import Seminar6_HomeWork.Controllers.UserController;
import Seminar6_HomeWork.Model.Fields;
import Seminar6_HomeWork.Model.User;


public class ViewUser {

    private final UserController userController;


    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com = Commands.NONE;
        showHelp();
        while (true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        create();
                        break;
                    case READ:
                        read();
                        break;
                    case LIST:
                        list();
                        break;
                    case DELETE:
                        delete();
                        break;
                    case HELP:
                        showHelp();
                }
            }
            catch(Exception ex) {
                System.out.println("Произошла ошибка " + ex.toString());
            }
        }
    }
    private void read() throws Exception {
        String id = prompt("Идентификатор пользователя: ");
        User user_ = userController.readUser(id);
        System.out.println(user_);
    }




    private void list() throws Exception {
        for (User user : userController.getUsers()) {
            System.out.println(user);
        }
    }
    private void create() throws Exception {
        String header = prompt("Заголовок: ");
        String text = prompt("Текст: ");


        userController.saveUser(new User(header, text));
    }
    private void delete() throws Exception {
        String userid = prompt("Введите ID заметки, которую надо удалить: ");
        User _user = userController.readUser(userid);
        userController.deleteUser(_user);
    }

    private void showHelp() {
        System.out.println("Список команд:");
        for(Commands c : Commands.values()) {
            System.out.println(c);
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}