package proiect.business.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proiect.persistence.entity.Skill;
import proiect.persistence.repository.SkillRepository;
import proiect.persistence.repository.UserRepository;

import java.util.List;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;

    public List<Skill> getSkills(){
        return skillRepository.findAll();
    }
}
