package proiect.business.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proiect.persistence.entity.User;
import proiect.persistence.repository.UserRepository;

@Service
public class UserService {
    //private static final Logger log = LogManager.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        //log.info("createUser: user to create={}", user);
        userRepository.save(user);
    }

    //@Override
    /*public boolean login(String username, String password) throws BusinessException {
        log.info("login: username={}", username);
        Optional<User> user = userDao.getUserByUsername(username);

        User userFound = user.orElseThrow(() -> new BusinessException(BusinessExceptionCode.CAN_NOT_GET_USER));
        if (!Encryptor.encrypt(password).equals(userFound.getPassword())) {
            throw new BusinessException(BusinessExceptionCode.PASSWORD_NOT_VALID);
        }

        return true;
    }*/

}
