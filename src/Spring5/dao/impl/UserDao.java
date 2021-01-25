package Spring5.dao.impl;

import Spring5.dao.BaseDao;

import java.util.Date;

/**
 * @author Eric
 * @date 2021/1/23 17:02
 */
public class UserDao implements BaseDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add() {
        System.out.println(new Date());
    }

    @Override
    public int add2(int a, int b) {
        int i=1/0;
        System.out.println("i do it");
        return a+b;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "name='" + name + '\'' +
                '}';
    }
}
