package proiect.business.control;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proiect.business.exception.BusinessException;
import proiect.business.exception.BusinessExceptionCode;
import proiect.business.utils.Encryptor;
import proiect.persistence.entity.User;
import proiect.persistence.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(UserService.class);


    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        user.setPassword(Encryptor.encrypt(user.getPassword()));
        userRepository.save(user);
    }

    public User login(String username, String password) throws BusinessException {
        Optional<User> user = userRepository.findUserByUsername(username);

        User userFound = user.orElseThrow(() -> new BusinessException(BusinessExceptionCode.CAN_NOT_GET_USER));
        log.info("user found: username={}", userFound);
        if (!Encryptor.encrypt(password).equals(userFound.getPassword())) {
            throw new BusinessException(BusinessExceptionCode.PASSWORD_NOT_VALID);
        }

        return userFound;
    }

}
