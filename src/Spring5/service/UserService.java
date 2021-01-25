package Spring5.service;

import Spring5.User;
import Spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Eric
 * @date 2021/1/23 17:01
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    public void add(User user) {
        userDao.add(user);
    }

    public void change() {
        userDao.changePassword();
        int i = 1 / 0;
        userDao.changePassword02();
    }
}
