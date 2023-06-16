package Seminar6_HomeWork;


import Seminar6_HomeWork.Logger.Decorator;
import Seminar6_HomeWork.Logger.LoggerTerminal;
import Seminar6_HomeWork.Controllers.UserController;
import Seminar6_HomeWork.Model.FileOperation;
import Seminar6_HomeWork.Model.FileOperationImpl;
import Seminar6_HomeWork.Model.Repository;
import Seminar6_HomeWork.Model.RepositoryFile;
import Seminar6_HomeWork.View.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new Decorator(new RepositoryFile(fileOperation), new LoggerTerminal());
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);

        view.run();
    }
}