package Seminar6_HomeWork_Notes;


import Seminar6_HomeWork_Notes.Logger.Decorator;
import Seminar6_HomeWork_Notes.Logger.LoggerTerminal;
import Seminar6_HomeWork_Notes.Controllers.UserController;
import Seminar6_HomeWork_Notes.Model.FileOperation;
import Seminar6_HomeWork_Notes.Model.FileOperationImpl;
import Seminar6_HomeWork_Notes.Model.Repository;
import Seminar6_HomeWork_Notes.Model.RepositoryFile;
import Seminar6_HomeWork_Notes.View.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new Decorator(new RepositoryFile(fileOperation), new LoggerTerminal());
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);

        view.run();
    }
}