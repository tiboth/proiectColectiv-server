package proiect.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import proiect.persistence.entity.Skill;
import proiect.persistence.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    public User findById(String id);

    Optional<User> findUserByUsername(String username);

    public List<User> findAll();

}
