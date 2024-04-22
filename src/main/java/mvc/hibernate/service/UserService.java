package mvc.hibernate.service;

import mvc.hibernate.entity.User;

import java.util.List;

public interface UserService {

    void save(User user);
    List<User> listAll();
    User find(Long id);
    void update(User user);
    void delete(Long id);

}
