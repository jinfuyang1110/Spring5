package Spring5.dao;

import Spring5.User;
import org.springframework.stereotype.Repository;

/**
 * @author Eric
 * @date 2021/1/24 15:47
 */
public interface UserDao {

    void add(User user);
void changePassword();
void changePassword02();
}
