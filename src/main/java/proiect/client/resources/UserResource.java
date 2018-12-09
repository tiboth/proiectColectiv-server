package proiect.client.resources;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import proiect.business.control.UserService;
import proiect.business.exception.BusinessException;
import proiect.persistence.entity.User;

@Controller
@RequestMapping("user")
public class UserResource {
    private static final Logger log = LogManager.getLogger(UserResource.class);


    @Autowired
    UserService userService;

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

}
