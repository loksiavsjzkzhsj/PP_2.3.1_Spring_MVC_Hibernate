package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getUserList();
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
    User getUserById(long id);
}
