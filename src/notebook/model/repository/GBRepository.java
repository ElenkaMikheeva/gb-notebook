package notebook.model.repository;

import notebook.model.User;

import java.util.List;
import java.util.Optional;

public interface GBRepository {
    List<User> findAll();
    void create(User user);
    Optional<User> findById(Long id);
    void update(Long userId, User user);
    boolean delete(Long id);
}
