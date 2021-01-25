package test;

import Spring5.Book;
import Spring5.User;
import Spring5.bean.*;
import Spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Eric
 * @date 2021/1/23 15:03
 */
public class BeanTest {
    @Test
    public void test() {
//        加载xml配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void test04() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
    }

    @Test
    public void test03() {
        Book book = new Book("sdf", null);
        System.out.println(book);
    }

    @Test
    public void test05() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
    }

    @Test
    public void test06() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Actor actor = context.getBean("actor", Actor.class);
        System.out.println(actor);
        context.close();
    }

    @Test
    public void test07() throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    @Test
    public void test08() {
//        xml配置文件开发
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Flower flower = context.getBean("flower", Flower.class);
        System.out.println(flower);
    }
    @Test
    public void test09(){
//        完全注解开发
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Flower flower = context.getBean("flower", Flower.class);
        System.out.println(flower);
    }
    @Test
    public void test10(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Sister sister = context.getBean("sister", Sister.class);
        sister.say();
    }
}
