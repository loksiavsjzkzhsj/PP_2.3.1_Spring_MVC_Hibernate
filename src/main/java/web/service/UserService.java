package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
    User getUserById(long id);
}
