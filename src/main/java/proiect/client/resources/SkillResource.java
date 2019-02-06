package proiect.client.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import proiect.persistence.entity.Skill;
import proiect.persistence.entity.User;
import proiect.persistence.repository.SkillRepository;

import java.util.List;

@RestController
@RequestMapping("skill")
public class SkillResource {

    @Autowired
    SkillRepository skillRepository;

    @RequestMapping(path = "/findById", method = RequestMethod.GET)
    public String findById(@RequestParam(value = "id", defaultValue = "0") Long id) {
        return skillRepository.findById(id).toString();
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public Skill addSkill(@RequestBody Skill skill) {
        return skillRepository.save(skill);
    }

    @RequestMapping(path = "/findAll", method = RequestMethod.GET)
    public List<Skill> findall() {
        return skillRepository.findAll();
    }
}
