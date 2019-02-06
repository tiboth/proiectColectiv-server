package proiect.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import proiect.persistence.entity.Profil;

import java.util.Optional;

public interface ProfilRepository extends CrudRepository<Profil, Long> {

    Optional<Profil> findProfilById(Long id);
}
