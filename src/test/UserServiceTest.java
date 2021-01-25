package test;

import Spring5.User;
import Spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author Eric
 * @date 2021/1/24 16:43
 */
public class UserServiceTest {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
    UserService userService = context.getBean("userService", UserService.class);
    @Test
    public void add() {
        userService.add(new User("pretty girl","fuck you","rbq@rbq.com"));
    }
    @Test
    public void change(){
        userService.change();
    }
}