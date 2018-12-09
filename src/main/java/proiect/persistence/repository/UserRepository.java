package proiect.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import proiect.persistence.entity.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findUserByUsername(String username);
}
