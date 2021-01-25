package Spring5.dao.impl;

import Spring5.User;
import Spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Eric
 * @date 2021/1/24 15:47
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        String sql="insert into t_user(username,password,email)values(?,?,?)";
        jdbcTemplate.update(sql,user.getName(),user.getPassword(),user.getEmail());
    }

    @Override
    public void changePassword() {
        String sql="update t_user set password='1' where id=1";
        jdbcTemplate.update(sql);
    }

    @Override
    public void changePassword02() {
        String sql="update t_user set password='2' where id=2";
        jdbcTemplate.update(sql);
    }
}
