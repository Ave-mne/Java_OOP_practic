package Seminar6_HomeWork.Controllers;

import java.util.List;

import Seminar6_HomeWork.Model.Fields;
import Seminar6_HomeWork.Model.Repository;
import Seminar6_HomeWork.Model.User;


public class UserController {
    private final Repository repository;


    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) throws Exception {
        repository.CreateUser(user);
    }
    public void updateUser(User user,Fields field, String param) throws Exception {
        repository.UpdateUser(user, field, param);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("User not found");
    }
    public List <User> getUsers() throws Exception {
        return repository.getAllUsers();
    }
    public void deleteUser(User user) throws Exception {
        repository.delUser(user);}
}