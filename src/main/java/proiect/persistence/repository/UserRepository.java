package proiect.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import proiect.persistence.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

    //Optional<User> findUserByUserName(String username);
}
