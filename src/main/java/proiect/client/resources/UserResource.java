package proiect.client.resources;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import proiect.business.control.UserService;
import proiect.business.exception.BusinessException;
import proiect.persistence.entity.Skill;
import proiect.persistence.entity.User;
import proiect.persistence.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserResource {
    private static final Logger log = LogManager.getLogger(UserResource.class);


    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @PostMapping(path="/addUser")
    @ResponseStatus(HttpStatus.OK)
    public void addUser(@RequestBody User user){
        log.info("add user: user={}", user);
        userService.addUser(user);
    }

    @PostMapping(path="loginUser")
    @ResponseStatus(HttpStatus.OK)
    public void login(@RequestBody User user) throws BusinessException{
        log.info("login request: user={}", user);
        if (userService.login(user.getUsername(), user.getPassword())) {
            log.info("login successful: user={}", user);
        } else {
            log.info("login unsuccessful: user={}", user);
        }
    }
    @PostMapping(path="/updateUser")
    @ResponseStatus(HttpStatus.OK)
    public User updateUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @RequestMapping(path = "/findById/{id}", method = RequestMethod.GET)
    public User findById( @PathVariable Long id) {
        return this.userRepository.findById(id).get();
    }

    @RequestMapping(path = "/findAll", method = RequestMethod.GET)
    public List<User> findall() {
        return userRepository.findAll();
    }

    @RequestMapping(path = "/findSkills", method = RequestMethod.GET)
    public List<Skill> findSkills(@RequestParam(value = "id", defaultValue = "0") Long id) {
        User user;

        if (userRepository.existsById(Long.valueOf(id))) {
            user = findById(id);
            return user.getSkills();
        }
            return null;
    }

}
