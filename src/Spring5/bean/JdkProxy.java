package Spring5.bean;

import Spring5.dao.BaseDao;
import Spring5.dao.impl.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author Eric
 * @date 2021/1/24 11:38
 */
public class JdkProxy {
    public static void main(String[] args) {
        Class[]interfaces={BaseDao.class};
        Object o = Proxy.newProxyInstance(JdkProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args)  {
                try {
                    System.out.println("要加强的方法是"+method.getName()+"\n"+"参数有："+ Arrays.toString(args));
//                被增强的方法执行
                    Object invoke = method.invoke(new UserDao(), args);
//                方法执行后
                    System.out.println("一脸懵逼");
                    return invoke;
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("i am always stay here");
                }
                return null;
            }
        });
        BaseDao dao=(BaseDao)o;
        System.out.println(dao.add2(3,5));
    }
}
