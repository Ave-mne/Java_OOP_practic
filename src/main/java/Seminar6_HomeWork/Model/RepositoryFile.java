package Seminar6_HomeWork.Model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private UserMapper mapper = new UserMapper();
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.map(line));
        }
        return users;
    }

    @Override
    public void UpdateUser(User user,Fields field, String param){
        if(field == Fields.HEADER){
            user.setHeader(param);
        }
        else if(field == Fields.TEXT){
            user.setText(param);
        }

        saveUser(user);
    }

    public void saveUser(User user){
        List<String> lines = new ArrayList<>();
        List<User> users = getAllUsers();
        for (User item: users) {
            if(user.getId().equals(item.getId())){
                lines.add(mapper.map(user));
            }
            else {
                lines.add(mapper.map(item));

            }
        }
        fileOperation.saveAllLines(lines);

    }

    @Override
    public String CreateUser(User user) {

        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        users.add(user);
        List<String> lines = new ArrayList<>();
        for (User item: users) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
        return id;
    }
    @Override
    public void delUser(User user) {
        List<String> lines = new ArrayList<>();
        List<User> users = getAllUsers();
        for (User item: users) {
            if(!user.getId().equals(item.getId()))
                lines.add(mapper.map(item));
        }

        fileOperation.saveAllLines(lines);
        System.out.println("Удалено!");
    }
}