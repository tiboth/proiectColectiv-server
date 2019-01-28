package proiect.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import proiect.persistence.entity.Skill;
import proiect.persistence.entity.User;

import java.util.List;
import java.util.Optional;

public interface SkillRepository extends CrudRepository<Skill,Long> {

    public Skill findAllById(Long id);

    public List<Skill> findAll();

}
